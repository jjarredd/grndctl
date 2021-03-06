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
// Generated on: 2014.12.06 at 02:18:33 PM EST 
//

package com.grndctl.model.station;

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
 *         &lt;element ref="{}station_id"/>
 *         &lt;element ref="{}wmo_id" minOccurs="0"/>
 *         &lt;element ref="{}latitude"/>
 *         &lt;element ref="{}longitude"/>
 *         &lt;element ref="{}elevation_m"/>
 *         &lt;element ref="{}site"/>
 *         &lt;element ref="{}state" minOccurs="0"/>
 *         &lt;element ref="{}country"/>
 *         &lt;element ref="{}site_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "stationId", "wmoId", "latitude",
        "longitude", "elevationM", "site", "state", "country", "siteType" })
@XmlRootElement(name = "Station")
public class Station {

    @XmlElement(name = "station_id", required = true)
    protected String stationId;
    @XmlElement(name = "wmo_id")
    protected String wmoId;
    protected float latitude;
    protected float longitude;
    @XmlElement(name = "elevation_m")
    protected float elevationM;
    @XmlElement(required = true)
    protected String site;
    protected String state;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(name = "site_type")
    protected SiteType siteType;

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
     * Gets the value of the wmoId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getWmoId() {
        return wmoId;
    }

    /**
     * Sets the value of the wmoId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setWmoId(String value) {
        this.wmoId = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the elevationM property.
     * 
     */
    public float getElevationM() {
        return elevationM;
    }

    /**
     * Sets the value of the elevationM property.
     * 
     */
    public void setElevationM(float value) {
        this.elevationM = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the siteType property.
     * 
     * @return possible object is {@link SiteType }
     * 
     */
    public SiteType getSiteType() {
        return siteType;
    }

    /**
     * Sets the value of the siteType property.
     * 
     * @param value
     *            allowed object is {@link SiteType }
     * 
     */
    public void setSiteType(SiteType value) {
        this.siteType = value;
    }

}
