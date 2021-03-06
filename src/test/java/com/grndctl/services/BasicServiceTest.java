/**
 * MIT License
 *
 * Copyright (c) 2016 grndctl
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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
package com.grndctl.services;

import com.grndctl.model.flightplan.ValidationResults;
import com.grndctl.model.metar.METAR;
import com.grndctl.model.station.FaaStation;
import com.grndctl.model.station.Station;
import com.grndctl.model.taf.TAF;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.grndctl.model.taf.TimeType.VALID;
import static org.junit.Assert.*;

/**
 * Basic service tests.  Not all will be represented as calls can return empty based on current conditions and reports
 * issued by the NWS. This test will be using live data.
 *
 * @author Michael Di Salvo
 */
public class BasicServiceTest {

    private static MetarSvc metarSvc;
    private static TafSvc tafSvc;
    private static StationSvc stationSvc;
    private static IntlFPValidationSvc intlFPValidationSvc;

    @BeforeClass
    public static void beforeClass() {
        metarSvc = new MetarSvc();
        tafSvc = new TafSvc();
        stationSvc = new StationSvc();
        intlFPValidationSvc = new IntlFPValidationSvc();
    }

    @Test
    public void testMetarSvc() throws Exception {
        METAR currentMETAR = metarSvc.getMetars("KIAD", 2.0).get(0);
        assertNotNull(currentMETAR);
        assertEquals("KIAD", currentMETAR.getStationId());
    }

    @Test
    public void testTafSvc() throws Exception {
        TAF currentTAF = tafSvc.getTafs("KIAD", 1.0, VALID).get(0);
        assertNotNull(currentTAF);
        assertEquals("KIAD", currentTAF.getStationId());
    }

    @Test
    public void testStationSvc() throws Exception {
        Station station = stationSvc.getStationInfo("KIAD").get(0);
        assertNotNull(station);
        assertEquals("KIAD", station.getStationId());

        FaaStation faaStatus = stationSvc.getFAAStationStatus("IAD");
        assertTrue(faaStatus.getIata().equals("IAD"));
        assertTrue(faaStatus.getIcao().equals("KIAD"));
        assertTrue(faaStatus.getName().equals("Washington Dulles International"));
    }

    @Test
    public void testFPSvc() throws Exception {
        String fpString = "(FPL-DLH560_IS\n" +
                "-1A319/M-SHWY/S\n" +
                "-EGLL0600\n" +
                "-N0420F370 BPK UQ295 CLN UL620 ARTOV UP44 SOMVA UP155 OKOKO UZ303 DHE UP729 DOSUR P729 LUGAS\n" +
                "-EKCH0715 ESMS)";

        ValidationResults results = intlFPValidationSvc.validateFlightPlan(fpString);
        assertEquals(fpString, results.getFlightPlan());
        assertNotNull(results.getMessages());
    }
}
