//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.29 at 02:47:11 PM UTC 
//


package se.trixon.trv_traffic_information.road.surface.roadgeometry.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Geometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Geometry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SWEREF99TM3D" type="{}WKT_SWEREF99TM3D" minOccurs="0"/&gt;
 *         &lt;element name="WGS843D" type="{}WKT_WGS843D" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geometry", propOrder = {
    "sweref99TM3D",
    "wgs843D"
})
public class Geometry {

    @XmlElement(name = "SWEREF99TM3D")
    protected String sweref99TM3D;
    @XmlElement(name = "WGS843D")
    protected String wgs843D;

    /**
     * Gets the value of the sweref99TM3D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWEREF99TM3D() {
        return sweref99TM3D;
    }

    /**
     * Sets the value of the sweref99TM3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWEREF99TM3D(String value) {
        this.sweref99TM3D = value;
    }

    /**
     * Gets the value of the wgs843D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWGS843D() {
        return wgs843D;
    }

    /**
     * Sets the value of the wgs843D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWGS843D(String value) {
        this.wgs843D = value;
    }

}