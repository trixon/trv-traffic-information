//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.29 at 02:46:15 PM UTC 
//


package se.trixon.trv_traffic_information.road.surface.pavementdata.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INFO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INFO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LASTMODIFIED" type="{}LASTMODIFIED" minOccurs="0"/&gt;
 *         &lt;element name="LASTCHANGEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EVALRESULT" type="{}EVALRESULT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SSEURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INFO", propOrder = {
    "lastmodified",
    "lastchangeid",
    "evalresult",
    "sseurl"
})
public class INFO {

    @XmlElement(name = "LASTMODIFIED")
    protected LASTMODIFIED lastmodified;
    @XmlElement(name = "LASTCHANGEID")
    protected String lastchangeid;
    @XmlElement(name = "EVALRESULT")
    protected List<EVALRESULT> evalresult;
    @XmlElement(name = "SSEURL")
    protected String sseurl;

    /**
     * Gets the value of the lastmodified property.
     * 
     * @return
     *     possible object is
     *     {@link LASTMODIFIED }
     *     
     */
    public LASTMODIFIED getLASTMODIFIED() {
        return lastmodified;
    }

    /**
     * Sets the value of the lastmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link LASTMODIFIED }
     *     
     */
    public void setLASTMODIFIED(LASTMODIFIED value) {
        this.lastmodified = value;
    }

    /**
     * Gets the value of the lastchangeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTCHANGEID() {
        return lastchangeid;
    }

    /**
     * Sets the value of the lastchangeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTCHANGEID(String value) {
        this.lastchangeid = value;
    }

    /**
     * Gets the value of the evalresult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evalresult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEVALRESULT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EVALRESULT }
     * 
     * 
     */
    public List<EVALRESULT> getEVALRESULT() {
        if (evalresult == null) {
            evalresult = new ArrayList<EVALRESULT>();
        }
        return this.evalresult;
    }

    /**
     * Gets the value of the sseurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSEURL() {
        return sseurl;
    }

    /**
     * Sets the value of the sseurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSEURL(String value) {
        this.sseurl = value;
    }

}
