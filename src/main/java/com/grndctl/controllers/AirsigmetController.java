/**
 * This file is part of grndctl.
 *
 * grndctl is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * grndctl is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with grndctl.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.grndctl.controllers;

import com.grndctl.ServiceException;
import com.grndctl.model.airsigmet.AIRSIGMET;
import com.grndctl.services.AirsigmetSvc;
import com.qmino.miredot.annotations.ReturnType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
/**
 * Retrieve AIRSIGMETs from the NWS.
 *
 * @author Michael Di Salvo
 */
@RestController
@RequestMapping("/airsigmet")
public class AirsigmetController extends AbstractController {

    private static final String HRS_BEFORE = "hrsBefore";
    private static final String MAX_ALT_FT = "maxAltitudeFt";
    private static final String MIN_ALT_FT = "minAltitudeFt";
    private static final String MIN_LAT = "minLat";
    private static final String MAX_LAT = "maxLat";
    private static final String MIN_LON = "minLon";
    private static final String MAX_LON = "maxLon";

    private final AirsigmetSvc svc;

    @Autowired
    public AirsigmetController(final AirsigmetSvc svc) {
        this.svc = svc;
    }

    /**
     * Retrieve all of the active <code>AIRSIGMET</code>s currently issued by the NWS.
     *
     * @return <code>List</code> of <code>AIRSIGMET</code>s
     * @throws com.grndctl.ServiceException
     */
    @RequestMapping(value = "", method = GET, produces = "application/json")
    @ReturnType(value = "java.util.List<com.grndctl.model.airsigmet.AIRSIGMET>")
    public ResponseEntity<List<AIRSIGMET>> getAirsigmets() throws ServiceException {
        return new ResponseEntity<>(svc.getAirsigmets(), HttpStatus.OK);
    }

    /**
     * Retrieve <code>AIRSIGMET</code>s by altitude range, with an additional parameter for hours before now.
     *
     * @param hrsBefore Hours before now (Default -> 1.0)
     * @param minAltFt Minimum altitude (Default -> 5000)
     * @param maxAltFt Maximum altitude (Default -> 30000)
     * @return <code>List</code> of filtered <code>AIRSIGMET</code>s
     * @throws com.grndctl.ServiceException
     */
    @RequestMapping(value = "/altLimited", method = GET, produces = "application/json")
    @ReturnType(value = "java.util.List<com.grndctl.model.airsigmet.AIRSIGMET>")
    public ResponseEntity<List<AIRSIGMET>> getAirsigmetsByAlt(
            @RequestParam(value = HRS_BEFORE, required = true, defaultValue = "1.0") double hrsBefore,
            @RequestParam(value = MIN_ALT_FT, required = true, defaultValue = "5000") int minAltFt,
            @RequestParam(value = MAX_ALT_FT, required = true, defaultValue = "30000") int maxAltFt) throws ServiceException {
        return new ResponseEntity<>(svc.getAirsigmetsInAltitudeRange(minAltFt, maxAltFt, hrsBefore), HttpStatus.OK);
    }

    /**
     * Retreive <code>AIRSIGMET</code>s by lat/lon box, with an additional parameter for hours before now.
     *
     * @param hrsBefore Hours before now (Default -> 1.0)
     * @param minLat Minimum latitude (Default -> 25)
     * @param maxLat Maximum latitude (Default -> 65)
     * @param minLon Minimum longitude (Default -> -130)
     * @param maxLon Maximum longitude (Default -> -40)
     * @return <code>List</code> of filtered <code>AIRSIGMET</code>s
     * @throws com.grndctl.ServiceException
     */
    @RequestMapping(value = "/latLonLimited", method = GET, produces = "application/json")
    @ReturnType(value = "java.util.List<com.grndctl.model.airsigmet.AIRSIGMET>")
    public ResponseEntity<List<AIRSIGMET>> getAirsimetsByLatLon(
            @RequestParam(value = HRS_BEFORE, required = true, defaultValue = "1.0") double hrsBefore,
            @RequestParam(value = MIN_LAT, required = true, defaultValue = "25") int minLat,
            @RequestParam(value = MAX_LAT, required = true, defaultValue = "65") int maxLat,
            @RequestParam(value = MIN_LON, required = true, defaultValue = "-130") int minLon,
            @RequestParam(value = MAX_LON, required = true, defaultValue = "-40") int maxLon) throws ServiceException {
        return new ResponseEntity<>(svc.getAirsigmetsInLatLongRectangle(minLat, minLon, maxLat, maxLon, hrsBefore), HttpStatus.OK);
    }

}
