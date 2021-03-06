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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.06 at 02:17:20 PM EST 
//

package com.grndctl.model.metar;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}raw_text" minOccurs="0"/>
 *         &lt;element ref="{}station_id" minOccurs="0"/>
 *         &lt;element ref="{}observation_time" minOccurs="0"/>
 *         &lt;element ref="{}latitude" minOccurs="0"/>
 *         &lt;element ref="{}longitude" minOccurs="0"/>
 *         &lt;element ref="{}temp_c" minOccurs="0"/>
 *         &lt;element ref="{}dewpoint_c" minOccurs="0"/>
 *         &lt;element ref="{}wind_dir_degrees" minOccurs="0"/>
 *         &lt;element ref="{}wind_speed_kt" minOccurs="0"/>
 *         &lt;element ref="{}wind_gust_kt" minOccurs="0"/>
 *         &lt;element ref="{}visibility_statute_mi" minOccurs="0"/>
 *         &lt;element ref="{}altim_in_hg" minOccurs="0"/>
 *         &lt;element ref="{}sea_level_pressure_mb" minOccurs="0"/>
 *         &lt;element ref="{}quality_control_flags" minOccurs="0"/>
 *         &lt;element ref="{}wx_string" minOccurs="0"/>
 *         &lt;element ref="{}sky_condition" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{}flight_category" minOccurs="0"/>
 *         &lt;element ref="{}three_hr_pressure_tendency_mb" minOccurs="0"/>
 *         &lt;element ref="{}maxT_c" minOccurs="0"/>
 *         &lt;element ref="{}minT_c" minOccurs="0"/>
 *         &lt;element ref="{}maxT24hr_c" minOccurs="0"/>
 *         &lt;element ref="{}minT24hr_c" minOccurs="0"/>
 *         &lt;element ref="{}precip_in" minOccurs="0"/>
 *         &lt;element ref="{}pcp3hr_in" minOccurs="0"/>
 *         &lt;element ref="{}pcp6hr_in" minOccurs="0"/>
 *         &lt;element ref="{}pcp24hr_in" minOccurs="0"/>
 *         &lt;element ref="{}snow_in" minOccurs="0"/>
 *         &lt;element ref="{}vert_vis_ft" minOccurs="0"/>
 *         &lt;element ref="{}metar_type" minOccurs="0"/>
 *         &lt;element ref="{}elevation_m" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "rawText", "stationId", "observationTime",
        "latitude", "longitude", "tempC", "dewpointC", "windDirDegrees",
        "windSpeedKt", "windGustKt", "visibilityStatuteMi", "altimInHg",
        "seaLevelPressureMb", "qualityControlFlags", "wxString",
        "skyCondition", "flightCategory", "threeHrPressureTendencyMb", "maxTC",
        "minTC", "maxT24HrC", "minT24HrC", "precipIn", "pcp3HrIn", "pcp6HrIn",
        "pcp24HrIn", "snowIn", "vertVisFt", "metarType", "elevationM" })
@XmlRootElement(name = "METAR")
public class METAR {

    @XmlElement(name = "raw_text")
    protected String rawText;
    @XmlElement(name = "station_id")
    protected String stationId;
    @XmlElement(name = "observation_time")
    protected String observationTime;
    protected Float latitude;
    protected Float longitude;
    @XmlElement(name = "temp_c")
    protected Float tempC;
    @XmlElement(name = "dewpoint_c")
    protected Float dewpointC;
    @XmlElement(name = "wind_dir_degrees")
    protected Integer windDirDegrees;
    @XmlElement(name = "wind_speed_kt")
    protected Integer windSpeedKt;
    @XmlElement(name = "wind_gust_kt")
    protected Integer windGustKt;
    @XmlElement(name = "visibility_statute_mi")
    protected Float visibilityStatuteMi;
    @XmlElement(name = "altim_in_hg")
    protected Float altimInHg;
    @XmlElement(name = "sea_level_pressure_mb")
    protected Float seaLevelPressureMb;
    @XmlElement(name = "quality_control_flags")
    protected QualityControlFlags qualityControlFlags;
    @XmlElement(name = "wx_string")
    protected String wxString;
    @XmlElement(name = "sky_condition")
    protected List<SkyCondition> skyCondition;
    @XmlElement(name = "flight_category")
    protected String flightCategory;
    @XmlElement(name = "three_hr_pressure_tendency_mb")
    protected Float threeHrPressureTendencyMb;
    @XmlElement(name = "maxT_c")
    protected Float maxTC;
    @XmlElement(name = "minT_c")
    protected Float minTC;
    @XmlElement(name = "maxT24hr_c")
    protected Float maxT24HrC;
    @XmlElement(name = "minT24hr_c")
    protected Float minT24HrC;
    @XmlElement(name = "precip_in")
    protected Float precipIn;
    @XmlElement(name = "pcp3hr_in")
    protected Float pcp3HrIn;
    @XmlElement(name = "pcp6hr_in")
    protected Float pcp6HrIn;
    @XmlElement(name = "pcp24hr_in")
    protected Float pcp24HrIn;
    @XmlElement(name = "snow_in")
    protected Float snowIn;
    @XmlElement(name = "vert_vis_ft")
    protected Integer vertVisFt;
    @XmlElement(name = "metar_type")
    protected String metarType;
    @XmlElement(name = "elevation_m")
    protected Float elevationM;

    /**
     * Gets the value of the rawText property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRawText() {
        return rawText;
    }

    /**
     * Sets the value of the rawText property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRawText(String value) {
        this.rawText = value;
    }

    /**
     * Gets the value of the stationId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStationId() {
        return stationId;
    }

    /**
     * Sets the value of the stationId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setStationId(String value) {
        this.stationId = value;
    }

    /**
     * Gets the value of the observationTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getObservationTime() {
        return observationTime;
    }

    /**
     * Sets the value of the observationTime property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setObservationTime(String value) {
        this.observationTime = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setLatitude(Float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setLongitude(Float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the tempC property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getTempC() {
        return tempC;
    }

    /**
     * Sets the value of the tempC property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setTempC(Float value) {
        this.tempC = value;
    }

    /**
     * Gets the value of the dewpointC property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getDewpointC() {
        return dewpointC;
    }

    /**
     * Sets the value of the dewpointC property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setDewpointC(Float value) {
        this.dewpointC = value;
    }

    /**
     * Gets the value of the windDirDegrees property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getWindDirDegrees() {
        return windDirDegrees;
    }

    /**
     * Sets the value of the windDirDegrees property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setWindDirDegrees(Integer value) {
        this.windDirDegrees = value;
    }

    /**
     * Gets the value of the windSpeedKt property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getWindSpeedKt() {
        return windSpeedKt;
    }

    /**
     * Sets the value of the windSpeedKt property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setWindSpeedKt(Integer value) {
        this.windSpeedKt = value;
    }

    /**
     * Gets the value of the windGustKt property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getWindGustKt() {
        return windGustKt;
    }

    /**
     * Sets the value of the windGustKt property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setWindGustKt(Integer value) {
        this.windGustKt = value;
    }

    /**
     * Gets the value of the visibilityStatuteMi property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getVisibilityStatuteMi() {
        return visibilityStatuteMi;
    }

    /**
     * Sets the value of the visibilityStatuteMi property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setVisibilityStatuteMi(Float value) {
        this.visibilityStatuteMi = value;
    }

    /**
     * Gets the value of the altimInHg property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getAltimInHg() {
        return altimInHg;
    }

    /**
     * Sets the value of the altimInHg property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setAltimInHg(Float value) {
        this.altimInHg = value;
    }

    /**
     * Gets the value of the seaLevelPressureMb property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getSeaLevelPressureMb() {
        return seaLevelPressureMb;
    }

    /**
     * Sets the value of the seaLevelPressureMb property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setSeaLevelPressureMb(Float value) {
        this.seaLevelPressureMb = value;
    }

    /**
     * Gets the value of the qualityControlFlags property.
     * 
     * @return possible object is {@link QualityControlFlags }
     * 
     */
    public QualityControlFlags getQualityControlFlags() {
        return qualityControlFlags;
    }

    /**
     * Sets the value of the qualityControlFlags property.
     * 
     * @param value
     *            allowed object is {@link QualityControlFlags }
     * 
     */
    public void setQualityControlFlags(QualityControlFlags value) {
        this.qualityControlFlags = value;
    }

    /**
     * Gets the value of the wxString property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getWxString() {
        return wxString;
    }

    /**
     * Sets the value of the wxString property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setWxString(String value) {
        this.wxString = value;
    }

    /**
     * Gets the value of the skyCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the skyCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSkyCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SkyCondition }
     * 
     * 
     */
    public List<SkyCondition> getSkyCondition() {
        if (skyCondition == null) {
            skyCondition = new ArrayList<SkyCondition>();
        }
        return this.skyCondition;
    }

    public void setSkyCondition(List<SkyCondition> skyCondition) {
        this.skyCondition = skyCondition;
    }

    /**
     * Gets the value of the flightCategory property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFlightCategory() {
        return flightCategory;
    }

    /**
     * Sets the value of the flightCategory property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFlightCategory(String value) {
        this.flightCategory = value;
    }

    /**
     * Gets the value of the threeHrPressureTendencyMb property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getThreeHrPressureTendencyMb() {
        return threeHrPressureTendencyMb;
    }

    /**
     * Sets the value of the threeHrPressureTendencyMb property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setThreeHrPressureTendencyMb(Float value) {
        this.threeHrPressureTendencyMb = value;
    }

    /**
     * Gets the value of the maxTC property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getMaxTC() {
        return maxTC;
    }

    /**
     * Sets the value of the maxTC property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setMaxTC(Float value) {
        this.maxTC = value;
    }

    /**
     * Gets the value of the minTC property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getMinTC() {
        return minTC;
    }

    /**
     * Sets the value of the minTC property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setMinTC(Float value) {
        this.minTC = value;
    }

    /**
     * Gets the value of the maxT24HrC property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getMaxT24HrC() {
        return maxT24HrC;
    }

    /**
     * Sets the value of the maxT24HrC property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setMaxT24HrC(Float value) {
        this.maxT24HrC = value;
    }

    /**
     * Gets the value of the minT24HrC property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getMinT24HrC() {
        return minT24HrC;
    }

    /**
     * Sets the value of the minT24HrC property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setMinT24HrC(Float value) {
        this.minT24HrC = value;
    }

    /**
     * Gets the value of the precipIn property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getPrecipIn() {
        return precipIn;
    }

    /**
     * Sets the value of the precipIn property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setPrecipIn(Float value) {
        this.precipIn = value;
    }

    /**
     * Gets the value of the pcp3HrIn property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getPcp3HrIn() {
        return pcp3HrIn;
    }

    /**
     * Sets the value of the pcp3HrIn property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setPcp3HrIn(Float value) {
        this.pcp3HrIn = value;
    }

    /**
     * Gets the value of the pcp6HrIn property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getPcp6HrIn() {
        return pcp6HrIn;
    }

    /**
     * Sets the value of the pcp6HrIn property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setPcp6HrIn(Float value) {
        this.pcp6HrIn = value;
    }

    /**
     * Gets the value of the pcp24HrIn property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getPcp24HrIn() {
        return pcp24HrIn;
    }

    /**
     * Sets the value of the pcp24HrIn property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setPcp24HrIn(Float value) {
        this.pcp24HrIn = value;
    }

    /**
     * Gets the value of the snowIn property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getSnowIn() {
        return snowIn;
    }

    /**
     * Sets the value of the snowIn property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setSnowIn(Float value) {
        this.snowIn = value;
    }

    /**
     * Gets the value of the vertVisFt property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getVertVisFt() {
        return vertVisFt;
    }

    /**
     * Sets the value of the vertVisFt property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setVertVisFt(Integer value) {
        this.vertVisFt = value;
    }

    /**
     * Gets the value of the metarType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMetarType() {
        return metarType;
    }

    /**
     * Sets the value of the metarType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMetarType(String value) {
        this.metarType = value;
    }

    /**
     * Gets the value of the elevationM property.
     * 
     * @return possible object is {@link Float }
     * 
     */
    public Float getElevationM() {
        return elevationM;
    }

    /**
     * Sets the value of the elevationM property.
     * 
     * @param value
     *            allowed object is {@link Float }
     * 
     */
    public void setElevationM(Float value) {
        this.elevationM = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        METAR metar = (METAR) o;

        if (altimInHg != null ? !altimInHg.equals(metar.altimInHg) : metar.altimInHg != null) return false;
        if (dewpointC != null ? !dewpointC.equals(metar.dewpointC) : metar.dewpointC != null) return false;
        if (elevationM != null ? !elevationM.equals(metar.elevationM) : metar.elevationM != null) return false;
        if (flightCategory != null ? !flightCategory.equals(metar.flightCategory) : metar.flightCategory != null)
            return false;
        if (latitude != null ? !latitude.equals(metar.latitude) : metar.latitude != null) return false;
        if (longitude != null ? !longitude.equals(metar.longitude) : metar.longitude != null) return false;
        if (maxT24HrC != null ? !maxT24HrC.equals(metar.maxT24HrC) : metar.maxT24HrC != null) return false;
        if (maxTC != null ? !maxTC.equals(metar.maxTC) : metar.maxTC != null) return false;
        if (metarType != null ? !metarType.equals(metar.metarType) : metar.metarType != null) return false;
        if (minT24HrC != null ? !minT24HrC.equals(metar.minT24HrC) : metar.minT24HrC != null) return false;
        if (minTC != null ? !minTC.equals(metar.minTC) : metar.minTC != null) return false;
        if (observationTime != null ? !observationTime.equals(metar.observationTime) : metar.observationTime != null)
            return false;
        if (pcp24HrIn != null ? !pcp24HrIn.equals(metar.pcp24HrIn) : metar.pcp24HrIn != null) return false;
        if (pcp3HrIn != null ? !pcp3HrIn.equals(metar.pcp3HrIn) : metar.pcp3HrIn != null) return false;
        if (pcp6HrIn != null ? !pcp6HrIn.equals(metar.pcp6HrIn) : metar.pcp6HrIn != null) return false;
        if (precipIn != null ? !precipIn.equals(metar.precipIn) : metar.precipIn != null) return false;
        if (rawText != null ? !rawText.equals(metar.rawText) : metar.rawText != null) return false;
        if (seaLevelPressureMb != null ? !seaLevelPressureMb.equals(metar.seaLevelPressureMb) : metar.seaLevelPressureMb != null)
            return false;
        if (snowIn != null ? !snowIn.equals(metar.snowIn) : metar.snowIn != null) return false;
        if (stationId != null ? !stationId.equals(metar.stationId) : metar.stationId != null) return false;
        if (tempC != null ? !tempC.equals(metar.tempC) : metar.tempC != null) return false;
        if (threeHrPressureTendencyMb != null ? !threeHrPressureTendencyMb.equals(metar.threeHrPressureTendencyMb) : metar.threeHrPressureTendencyMb != null)
            return false;
        if (vertVisFt != null ? !vertVisFt.equals(metar.vertVisFt) : metar.vertVisFt != null) return false;
        if (visibilityStatuteMi != null ? !visibilityStatuteMi.equals(metar.visibilityStatuteMi) : metar.visibilityStatuteMi != null)
            return false;
        if (windDirDegrees != null ? !windDirDegrees.equals(metar.windDirDegrees) : metar.windDirDegrees != null)
            return false;
        if (windGustKt != null ? !windGustKt.equals(metar.windGustKt) : metar.windGustKt != null) return false;
        if (windSpeedKt != null ? !windSpeedKt.equals(metar.windSpeedKt) : metar.windSpeedKt != null) return false;
        if (wxString != null ? !wxString.equals(metar.wxString) : metar.wxString != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rawText != null ? rawText.hashCode() : 0;
        result = 31 * result + (stationId != null ? stationId.hashCode() : 0);
        result = 31 * result + (observationTime != null ? observationTime.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (tempC != null ? tempC.hashCode() : 0);
        result = 31 * result + (dewpointC != null ? dewpointC.hashCode() : 0);
        result = 31 * result + (windDirDegrees != null ? windDirDegrees.hashCode() : 0);
        result = 31 * result + (windSpeedKt != null ? windSpeedKt.hashCode() : 0);
        result = 31 * result + (windGustKt != null ? windGustKt.hashCode() : 0);
        result = 31 * result + (visibilityStatuteMi != null ? visibilityStatuteMi.hashCode() : 0);
        result = 31 * result + (altimInHg != null ? altimInHg.hashCode() : 0);
        result = 31 * result + (seaLevelPressureMb != null ? seaLevelPressureMb.hashCode() : 0);
        result = 31 * result + (wxString != null ? wxString.hashCode() : 0);
        result = 31 * result + (flightCategory != null ? flightCategory.hashCode() : 0);
        result = 31 * result + (threeHrPressureTendencyMb != null ? threeHrPressureTendencyMb.hashCode() : 0);
        result = 31 * result + (maxTC != null ? maxTC.hashCode() : 0);
        result = 31 * result + (minTC != null ? minTC.hashCode() : 0);
        result = 31 * result + (maxT24HrC != null ? maxT24HrC.hashCode() : 0);
        result = 31 * result + (minT24HrC != null ? minT24HrC.hashCode() : 0);
        result = 31 * result + (precipIn != null ? precipIn.hashCode() : 0);
        result = 31 * result + (pcp3HrIn != null ? pcp3HrIn.hashCode() : 0);
        result = 31 * result + (pcp6HrIn != null ? pcp6HrIn.hashCode() : 0);
        result = 31 * result + (pcp24HrIn != null ? pcp24HrIn.hashCode() : 0);
        result = 31 * result + (snowIn != null ? snowIn.hashCode() : 0);
        result = 31 * result + (vertVisFt != null ? vertVisFt.hashCode() : 0);
        result = 31 * result + (metarType != null ? metarType.hashCode() : 0);
        result = 31 * result + (elevationM != null ? elevationM.hashCode() : 0);
        return result;
    }
}
