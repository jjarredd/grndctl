//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.06 at 02:16:35 PM EST 
//

package com.grndctl.model.airsigmet;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.math.BigInteger;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.groundcontrol.airsigmet package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RawText_QNAME = new QName("", "raw_text");
    private final static QName _MovementSpeedKt_QNAME = new QName("",
            "movement_speed_kt");
    private final static QName _MovementDirDegrees_QNAME = new QName("",
            "movement_dir_degrees");
    private final static QName _ValidTimeTo_QNAME = new QName("",
            "valid_time_to");
    private final static QName _ValidTimeFrom_QNAME = new QName("",
            "valid_time_from");
    private final static QName _RequestIndex_QNAME = new QName("",
            "request_index");
    private final static QName _TimeTakenMs_QNAME = new QName("",
            "time_taken_ms");
    private final static QName _Warning_QNAME = new QName("", "warning");
    private final static QName _AirsigmetType_QNAME = new QName("",
            "airsigmet_type");
    private final static QName _Error_QNAME = new QName("", "error");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: com.groundcontrol.airsigmet
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Altitude }
     * 
     */
    public Altitude createAltitude() {
        return new Altitude();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link AIRSIGMET }
     * 
     */
    public AIRSIGMET createAIRSIGMET() {
        return new AIRSIGMET();
    }

    /**
     * Create an instance of {@link Hazard }
     * 
     */
    public Hazard createHazard() {
        return new Hazard();
    }

    /**
     * Create an instance of {@link Warnings }
     * 
     */
    public Warnings createWarnings() {
        return new Warnings();
    }

    /**
     * Create an instance of {@link DataSource }
     * 
     */
    public DataSource createDataSource() {
        return new DataSource();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Errors }
     * 
     */
    public Errors createErrors() {
        return new Errors();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "", name = "raw_text")
    public JAXBElement<String> createRawText(String value) {
        return new JAXBElement<String>(_RawText_QNAME, String.class, null,
                value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigInteger }
     * {@code >}
     * 
     */
    @XmlElementDecl(namespace = "", name = "movement_speed_kt")
    public JAXBElement<BigInteger> createMovementSpeedKt(BigInteger value) {
        return new JAXBElement<BigInteger>(_MovementSpeedKt_QNAME,
                BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigInteger }
     * {@code >}
     * 
     */
    @XmlElementDecl(namespace = "", name = "movement_dir_degrees")
    public JAXBElement<BigInteger> createMovementDirDegrees(BigInteger value) {
        return new JAXBElement<BigInteger>(_MovementDirDegrees_QNAME,
                BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "", name = "valid_time_to")
    public JAXBElement<String> createValidTimeTo(String value) {
        return new JAXBElement<String>(_ValidTimeTo_QNAME, String.class, null,
                value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "", name = "valid_time_from")
    public JAXBElement<String> createValidTimeFrom(String value) {
        return new JAXBElement<String>(_ValidTimeFrom_QNAME, String.class,
                null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "", name = "request_index")
    public JAXBElement<Integer> createRequestIndex(Integer value) {
        return new JAXBElement<Integer>(_RequestIndex_QNAME, Integer.class,
                null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "", name = "time_taken_ms")
    public JAXBElement<Integer> createTimeTakenMs(Integer value) {
        return new JAXBElement<Integer>(_TimeTakenMs_QNAME, Integer.class,
                null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "", name = "warning")
    public JAXBElement<String> createWarning(String value) {
        return new JAXBElement<String>(_Warning_QNAME, String.class, null,
                value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "", name = "airsigmet_type")
    public JAXBElement<String> createAirsigmetType(String value) {
        return new JAXBElement<String>(_AirsigmetType_QNAME, String.class,
                null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "", name = "error")
    public JAXBElement<String> createError(String value) {
        return new JAXBElement<String>(_Error_QNAME, String.class, null, value);
    }

}
