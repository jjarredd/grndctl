//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.06 at 02:18:46 PM EST 
//

package com.grndctl.model.taf;

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
 *         &lt;element ref="{}fcst_time_from" minOccurs="0"/>
 *         &lt;element ref="{}fcst_time_to" minOccurs="0"/>
 *         &lt;element ref="{}change_indicator" minOccurs="0"/>
 *         &lt;element ref="{}time_becoming" minOccurs="0"/>
 *         &lt;element ref="{}probability" minOccurs="0"/>
 *         &lt;element ref="{}wind_dir_degrees" minOccurs="0"/>
 *         &lt;element ref="{}wind_speed_kt" minOccurs="0"/>
 *         &lt;element ref="{}wind_gust_kt" minOccurs="0"/>
 *         &lt;element ref="{}wind_shear_hgt_ft_agl" minOccurs="0"/>
 *         &lt;element ref="{}wind_shear_dir_degrees" minOccurs="0"/>
 *         &lt;element ref="{}wind_shear_speed_kt" minOccurs="0"/>
 *         &lt;element ref="{}visibility_statute_mi" minOccurs="0"/>
 *         &lt;element ref="{}altim_in_hg" minOccurs="0"/>
 *         &lt;element ref="{}vert_vis_ft" minOccurs="0"/>
 *         &lt;element ref="{}wx_string" minOccurs="0"/>
 *         &lt;element ref="{}not_decoded" minOccurs="0"/>
 *         &lt;element ref="{}sky_condition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}turbulence_condition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}icing_condition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}temperature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "fcstTimeFrom", "fcstTimeTo",
        "changeIndicator", "timeBecoming", "probability", "windDirDegrees",
        "windSpeedKt", "windGustKt", "windShearHgtFtAgl",
        "windShearDirDegrees", "windShearSpeedKt", "visibilityStatuteMi",
        "altimInHg", "vertVisFt", "wxString", "notDecoded", "skyCondition",
        "turbulenceCondition", "icingCondition", "temperature" })
@XmlRootElement(name = "forecast")
public class Forecast {

    @XmlElement(name = "fcst_time_from")
    protected String fcstTimeFrom;
    @XmlElement(name = "fcst_time_to")
    protected String fcstTimeTo;
    @XmlElement(name = "change_indicator")
    protected String changeIndicator;
    @XmlElement(name = "time_becoming")
    protected String timeBecoming;
    protected Integer probability;
    @XmlElement(name = "wind_dir_degrees")
    protected Short windDirDegrees;
    @XmlElement(name = "wind_speed_kt")
    protected Integer windSpeedKt;
    @XmlElement(name = "wind_gust_kt")
    protected Integer windGustKt;
    @XmlElement(name = "wind_shear_hgt_ft_agl")
    protected Short windShearHgtFtAgl;
    @XmlElement(name = "wind_shear_dir_degrees")
    protected Short windShearDirDegrees;
    @XmlElement(name = "wind_shear_speed_kt")
    protected Integer windShearSpeedKt;
    @XmlElement(name = "visibility_statute_mi")
    protected Float visibilityStatuteMi;
    @XmlElement(name = "altim_in_hg")
    protected Float altimInHg;
    @XmlElement(name = "vert_vis_ft")
    protected Short vertVisFt;
    @XmlElement(name = "wx_string")
    protected String wxString;
    @XmlElement(name = "not_decoded")
    protected String notDecoded;
    @XmlElement(name = "sky_condition")
    protected List<SkyCondition> skyCondition;
    @XmlElement(name = "turbulence_condition")
    protected List<TurbulenceCondition> turbulenceCondition;
    @XmlElement(name = "icing_condition")
    protected List<IcingCondition> icingCondition;
    protected List<Temperature> temperature;

    /**
     * Gets the value of the fcstTimeFrom property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFcstTimeFrom() {
        return fcstTimeFrom;
    }

    /**
     * Sets the value of the fcstTimeFrom property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFcstTimeFrom(String value) {
        this.fcstTimeFrom = value;
    }

    /**
     * Gets the value of the fcstTimeTo property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFcstTimeTo() {
        return fcstTimeTo;
    }

    /**
     * Sets the value of the fcstTimeTo property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFcstTimeTo(String value) {
        this.fcstTimeTo = value;
    }

    /**
     * Gets the value of the changeIndicator property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getChangeIndicator() {
        return changeIndicator;
    }

    /**
     * Sets the value of the changeIndicator property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setChangeIndicator(String value) {
        this.changeIndicator = value;
    }

    /**
     * Gets the value of the timeBecoming property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTimeBecoming() {
        return timeBecoming;
    }

    /**
     * Sets the value of the timeBecoming property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTimeBecoming(String value) {
        this.timeBecoming = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setProbability(Integer value) {
        this.probability = value;
    }

    /**
     * Gets the value of the windDirDegrees property.
     * 
     * @return possible object is {@link Short }
     * 
     */
    public Short getWindDirDegrees() {
        return windDirDegrees;
    }

    /**
     * Sets the value of the windDirDegrees property.
     * 
     * @param value
     *            allowed object is {@link Short }
     * 
     */
    public void setWindDirDegrees(Short value) {
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
     * Gets the value of the windShearHgtFtAgl property.
     * 
     * @return possible object is {@link Short }
     * 
     */
    public Short getWindShearHgtFtAgl() {
        return windShearHgtFtAgl;
    }

    /**
     * Sets the value of the windShearHgtFtAgl property.
     * 
     * @param value
     *            allowed object is {@link Short }
     * 
     */
    public void setWindShearHgtFtAgl(Short value) {
        this.windShearHgtFtAgl = value;
    }

    /**
     * Gets the value of the windShearDirDegrees property.
     * 
     * @return possible object is {@link Short }
     * 
     */
    public Short getWindShearDirDegrees() {
        return windShearDirDegrees;
    }

    /**
     * Sets the value of the windShearDirDegrees property.
     * 
     * @param value
     *            allowed object is {@link Short }
     * 
     */
    public void setWindShearDirDegrees(Short value) {
        this.windShearDirDegrees = value;
    }

    /**
     * Gets the value of the windShearSpeedKt property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getWindShearSpeedKt() {
        return windShearSpeedKt;
    }

    /**
     * Sets the value of the windShearSpeedKt property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setWindShearSpeedKt(Integer value) {
        this.windShearSpeedKt = value;
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
     * Gets the value of the vertVisFt property.
     * 
     * @return possible object is {@link Short }
     * 
     */
    public Short getVertVisFt() {
        return vertVisFt;
    }

    /**
     * Sets the value of the vertVisFt property.
     * 
     * @param value
     *            allowed object is {@link Short }
     * 
     */
    public void setVertVisFt(Short value) {
        this.vertVisFt = value;
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
     * Gets the value of the notDecoded property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNotDecoded() {
        return notDecoded;
    }

    /**
     * Sets the value of the notDecoded property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setNotDecoded(String value) {
        this.notDecoded = value;
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

    /**
     * Gets the value of the turbulenceCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the turbulenceCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTurbulenceCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TurbulenceCondition }
     * 
     * 
     */
    public List<TurbulenceCondition> getTurbulenceCondition() {
        if (turbulenceCondition == null) {
            turbulenceCondition = new ArrayList<TurbulenceCondition>();
        }
        return this.turbulenceCondition;
    }

    /**
     * Gets the value of the icingCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the icingCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getIcingCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IcingCondition }
     * 
     * 
     */
    public List<IcingCondition> getIcingCondition() {
        if (icingCondition == null) {
            icingCondition = new ArrayList<IcingCondition>();
        }
        return this.icingCondition;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the temperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Temperature }
     * 
     * 
     */
    public List<Temperature> getTemperature() {
        if (temperature == null) {
            temperature = new ArrayList<Temperature>();
        }
        return this.temperature;
    }

}
