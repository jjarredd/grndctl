//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.06 at 02:18:46 PM EST 
//

package com.grndctl.model.taf;

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
 *       &lt;attribute name="turbulence_intensity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="turbulence_min_alt_ft_agl" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="turbulence_max_alt_ft_agl" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "turbulence_condition")
public class TurbulenceCondition {

    @XmlAttribute(name = "turbulence_intensity")
    protected String turbulenceIntensity;
    @XmlAttribute(name = "turbulence_min_alt_ft_agl")
    protected Integer turbulenceMinAltFtAgl;
    @XmlAttribute(name = "turbulence_max_alt_ft_agl")
    protected Integer turbulenceMaxAltFtAgl;

    /**
     * Gets the value of the turbulenceIntensity property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTurbulenceIntensity() {
        return turbulenceIntensity;
    }

    /**
     * Sets the value of the turbulenceIntensity property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTurbulenceIntensity(String value) {
        this.turbulenceIntensity = value;
    }

    /**
     * Gets the value of the turbulenceMinAltFtAgl property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getTurbulenceMinAltFtAgl() {
        return turbulenceMinAltFtAgl;
    }

    /**
     * Sets the value of the turbulenceMinAltFtAgl property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setTurbulenceMinAltFtAgl(Integer value) {
        this.turbulenceMinAltFtAgl = value;
    }

    /**
     * Gets the value of the turbulenceMaxAltFtAgl property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getTurbulenceMaxAltFtAgl() {
        return turbulenceMaxAltFtAgl;
    }

    /**
     * Sets the value of the turbulenceMaxAltFtAgl property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setTurbulenceMaxAltFtAgl(Integer value) {
        this.turbulenceMaxAltFtAgl = value;
    }

}
