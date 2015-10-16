//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.06 at 02:17:20 PM EST 
//

package com.grndctl.model.metar;

import javax.xml.bind.annotation.*;

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
 *         &lt;element ref="{}corrected" minOccurs="0"/>
 *         &lt;element ref="{}auto" minOccurs="0"/>
 *         &lt;element ref="{}auto_station" minOccurs="0"/>
 *         &lt;element ref="{}maintenance_indicator_on" minOccurs="0"/>
 *         &lt;element ref="{}no_signal" minOccurs="0"/>
 *         &lt;element ref="{}lightning_sensor_off" minOccurs="0"/>
 *         &lt;element ref="{}freezing_rain_sensor_off" minOccurs="0"/>
 *         &lt;element ref="{}present_weather_sensor_off" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "corrected", "auto", "autoStation",
        "maintenanceIndicatorOn", "noSignal", "lightningSensorOff",
        "freezingRainSensorOff", "presentWeatherSensorOff" })
@XmlRootElement(name = "quality_control_flags")
public class QualityControlFlags {

    protected String corrected;
    protected String auto;
    @XmlElement(name = "auto_station")
    protected String autoStation;
    @XmlElement(name = "maintenance_indicator_on")
    protected String maintenanceIndicatorOn;
    @XmlElement(name = "no_signal")
    protected String noSignal;
    @XmlElement(name = "lightning_sensor_off")
    protected String lightningSensorOff;
    @XmlElement(name = "freezing_rain_sensor_off")
    protected String freezingRainSensorOff;
    @XmlElement(name = "present_weather_sensor_off")
    protected String presentWeatherSensorOff;

    /**
     * Gets the value of the corrected property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCorrected() {
        return corrected;
    }

    /**
     * Sets the value of the corrected property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCorrected(String value) {
        this.corrected = value;
    }

    /**
     * Gets the value of the auto property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAuto() {
        return auto;
    }

    /**
     * Sets the value of the auto property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAuto(String value) {
        this.auto = value;
    }

    /**
     * Gets the value of the autoStation property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAutoStation() {
        return autoStation;
    }

    /**
     * Sets the value of the autoStation property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAutoStation(String value) {
        this.autoStation = value;
    }

    /**
     * Gets the value of the maintenanceIndicatorOn property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMaintenanceIndicatorOn() {
        return maintenanceIndicatorOn;
    }

    /**
     * Sets the value of the maintenanceIndicatorOn property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMaintenanceIndicatorOn(String value) {
        this.maintenanceIndicatorOn = value;
    }

    /**
     * Gets the value of the noSignal property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNoSignal() {
        return noSignal;
    }

    /**
     * Sets the value of the noSignal property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setNoSignal(String value) {
        this.noSignal = value;
    }

    /**
     * Gets the value of the lightningSensorOff property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLightningSensorOff() {
        return lightningSensorOff;
    }

    /**
     * Sets the value of the lightningSensorOff property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLightningSensorOff(String value) {
        this.lightningSensorOff = value;
    }

    /**
     * Gets the value of the freezingRainSensorOff property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFreezingRainSensorOff() {
        return freezingRainSensorOff;
    }

    /**
     * Sets the value of the freezingRainSensorOff property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFreezingRainSensorOff(String value) {
        this.freezingRainSensorOff = value;
    }

    /**
     * Gets the value of the presentWeatherSensorOff property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPresentWeatherSensorOff() {
        return presentWeatherSensorOff;
    }

    /**
     * Sets the value of the presentWeatherSensorOff property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPresentWeatherSensorOff(String value) {
        this.presentWeatherSensorOff = value;
    }

}
