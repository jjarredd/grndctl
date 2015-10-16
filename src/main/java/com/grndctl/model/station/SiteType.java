//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.06 at 02:18:33 PM EST 
//

package com.grndctl.model.station;


import com.grndctl.model.metar.METAR;
import com.grndctl.model.taf.TAF;

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
 *         &lt;element ref="{}METAR" minOccurs="0"/>
 *         &lt;element ref="{}NEXRAD" minOccurs="0"/>
 *         &lt;element ref="{}rawinsonde" minOccurs="0"/>
 *         &lt;element ref="{}wind_profiler" minOccurs="0"/>
 *         &lt;element ref="{}WFO_office" minOccurs="0"/>
 *         &lt;element ref="{}TAF" minOccurs="0"/>
 *         &lt;element ref="{}SYNOPS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "metar", "nexrad", "rawinsonde",
        "windProfiler", "wfoOffice", "taf", "synops" })
@XmlRootElement(name = "site_type")
public class SiteType {

    @XmlElement(name = "METAR")
    protected METAR metar;
    @XmlElement(name = "NEXRAD")
    protected Object nexrad;
    protected Object rawinsonde;
    @XmlElement(name = "wind_profiler")
    protected Object windProfiler;
    @XmlElement(name = "WFO_office")
    protected Object wfoOffice;
    @XmlElement(name = "TAF")
    protected TAF taf;
    @XmlElement(name = "SYNOPS")
    protected Object synops;

    /**
     * Gets the value of the metar property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getMETAR() {
        return metar;
    }

    /**
     * Sets the value of the metar property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setMETAR(Object value) {
        this.metar = (METAR)value;
    }

    /**
     * Gets the value of the nexrad property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getNEXRAD() {
        return nexrad;
    }

    /**
     * Sets the value of the nexrad property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setNEXRAD(Object value) {
        this.nexrad = value;
    }

    /**
     * Gets the value of the rawinsonde property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getRawinsonde() {
        return rawinsonde;
    }

    /**
     * Sets the value of the rawinsonde property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setRawinsonde(Object value) {
        this.rawinsonde = value;
    }

    /**
     * Gets the value of the windProfiler property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getWindProfiler() {
        return windProfiler;
    }

    /**
     * Sets the value of the windProfiler property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setWindProfiler(Object value) {
        this.windProfiler = value;
    }

    /**
     * Gets the value of the wfoOffice property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getWFOOffice() {
        return wfoOffice;
    }

    /**
     * Sets the value of the wfoOffice property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setWFOOffice(Object value) {
        this.wfoOffice = value;
    }

    /**
     * Gets the value of the taf property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getTAF() {
        return taf;
    }

    /**
     * Sets the value of the taf property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setTAF(Object value) {
        this.taf = (TAF)value;
    }

    /**
     * Gets the value of the synops property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getSYNOPS() {
        return synops;
    }

    /**
     * Sets the value of the synops property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setSYNOPS(Object value) {
        this.synops = value;
    }

}
