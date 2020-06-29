//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.29 at 02:49:47 PM UTC 
//


package se.trixon.trv_trafikinformation.vag.ferryannonuncement.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.trixon.trv_trafikinformation.vag.ferryannonuncement.v1_2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RESPONSE_QNAME = new QName("", "RESPONSE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.trixon.trv_trafikinformation.vag.ferryannonuncement.v1_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RESPONSE }
     * 
     */
    public RESPONSE createRESPONSE() {
        return new RESPONSE();
    }

    /**
     * Create an instance of {@link RESULT }
     * 
     */
    public RESULT createRESULT() {
        return new RESULT();
    }

    /**
     * Create an instance of {@link ERROR }
     * 
     */
    public ERROR createERROR() {
        return new ERROR();
    }

    /**
     * Create an instance of {@link LASTMODIFIED }
     * 
     */
    public LASTMODIFIED createLASTMODIFIED() {
        return new LASTMODIFIED();
    }

    /**
     * Create an instance of {@link EVALRESULT }
     * 
     */
    public EVALRESULT createEVALRESULT() {
        return new EVALRESULT();
    }

    /**
     * Create an instance of {@link INFO }
     * 
     */
    public INFO createINFO() {
        return new INFO();
    }

    /**
     * Create an instance of {@link FerryAnnouncement }
     * 
     */
    public FerryAnnouncement createFerryAnnouncement() {
        return new FerryAnnouncement();
    }

    /**
     * Create an instance of {@link FromHarbor }
     * 
     */
    public FromHarbor createFromHarbor() {
        return new FromHarbor();
    }

    /**
     * Create an instance of {@link ToHarbor }
     * 
     */
    public ToHarbor createToHarbor() {
        return new ToHarbor();
    }

    /**
     * Create an instance of {@link Route }
     * 
     */
    public Route createRoute() {
        return new Route();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RESPONSE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RESPONSE }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "RESPONSE")
    public JAXBElement<RESPONSE> createRESPONSE(RESPONSE value) {
        return new JAXBElement<RESPONSE>(_RESPONSE_QNAME, RESPONSE.class, null, value);
    }

}
