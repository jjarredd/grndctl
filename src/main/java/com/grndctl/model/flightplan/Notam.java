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
package com.grndctl.model.flightplan;

/**
 */
public class Notam {

    public enum FormatType {

        DOMESTIC("DOMESTIC"), ICAO("ICAO");

        private String val;

        FormatType(String val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val;
        }

        public static FormatType fromString(String val) {
            FormatType[] types = FormatType.values();

            FormatType t = null;
            for (FormatType type : types) {
                if (type.toString().equals(val)) {
                    t = type;
                    break;
                }
            }

            return t;
        }
    }

    public enum ReportType {

        REPORT("REPORT"), RAW("RAW");

        private String val;

        ReportType(String val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val;
        }

        public static ReportType fromString(String val) {
            ReportType[] types = ReportType.values();

            ReportType rt = null;
            for (ReportType type : types) {
                if (type.toString().equals(val)) {
                    rt = type;
                    break;
                }
            }

            return rt;
        }

    }

}
