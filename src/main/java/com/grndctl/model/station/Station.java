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
