package com.grndctl.services;

import com.grndctl.model.flightplan.ValidationResults;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * <p>
 * FlightPlanValidator implementation that relies on Eurocontrol for flight plan validation.  This will eventually
 * include Eurocontrol error message specific parsing.  For now all messages are returned in a list.
 *
 * IFPS ONLY!
 *
 * <pre>
 * Ex.
 *
 * (FPL-DLH560_IS
 * -1A319/M-SHWY/S
 * -EGLL0600
 * -N0420F370 BPK UQ295 CLN UL620 ARTOV UP44 SOMVA UP155 OKOKO UZ303 DHE UP729 DOSUR P729 LUGAS
 * -EKCH0715 ESMS)
 *
 * </pre>
 *
 * </p>
 *
 * @author Michael Di Salvo
 */
@Service
public class IntlFPValidationSvc {

    private static final String FP_VALIDATION_URL = "http://validation.eurofpl.eu";
    private static final String USER_AGENT = "grndctl";
    private static final String IFPUV_RESULT = "ifpuv_result";

    public IntlFPValidationSvc() { }

    public ValidationResults validateFlightPlan(final String flightPlan) throws Exception {
        return sendRequestAndInterpretResults(flightPlan);
    }

    private ValidationResults sendRequestAndInterpretResults(final String flightPlan) throws IOException {
        Document validationDom = Jsoup
                .connect(FP_VALIDATION_URL)
                .data("freeEntry", flightPlan)
                .data("freeSubmit", "Validate")
                .userAgent(USER_AGENT)
                .timeout(5000)
                .post();

        ValidationResults results = new ValidationResults(flightPlan,
                parseMessagesFromElements(validationDom.getElementsByClass(IFPUV_RESULT)));

        return results;
    }

    private String parseMessagesFromElements(final List<Element> ifpuvResults) {
        checkNotNull(ifpuvResults);
        return ifpuvResults.get(0).text();
    }

}
