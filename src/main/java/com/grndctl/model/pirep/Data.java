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
// Generated on: 2014.12.06 at 02:17:36 PM EST 
//

package com.grndctl.model.pirep;

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
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}PIREP"/>
 *       &lt;/sequence>
 *       &lt;attribute name="num_results" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "pirep" })
@XmlRootElement(name = "data")
public class Data {

    @XmlElement(name = "PIREP")
    protected List<PIREP> pirep;
    @XmlAttribute(name = "num_results")
    protected Integer numResults;

    /**
     * Gets the value of the pirep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the pirep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPIREP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PIREP }
     * 
     * 
     */
    public List<PIREP> getPIREP() {
        if (pirep == null) {
            pirep = new ArrayList<PIREP>();
        }
        return this.pirep;
    }

    /**
     * Gets the value of the numResults property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getNumResults() {
        return numResults;
    }

    /**
     * Sets the value of the numResults property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setNumResults(Integer value) {
        this.numResults = value;
    }

}
