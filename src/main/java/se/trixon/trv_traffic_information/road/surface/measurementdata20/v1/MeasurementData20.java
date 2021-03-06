//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.29 at 02:45:08 PM UTC 
//


package se.trixon.trv_traffic_information.road.surface.measurementdata20.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MeasurementData20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementData20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoadMainNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoadSubNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Direction" type="{}Direction" minOccurs="0"/&gt;
 *         &lt;element name="Lane" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StartContinuousLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EndContinuousLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MeasurementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MeasurementDateSpecific" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MeasurementDataType" type="{}MeasurementDataType" minOccurs="0"/&gt;
 *         &lt;element name="IRILeft" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IRIRight" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MeasurementVehicleSpeed" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Hilliness" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Curvature" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="EdgeDepth" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MegatextureRight" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MegatextureLeft" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MPDMacrotextureRight" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MPDMacrotextureMiddle" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MPDMacrotextureLeft" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RutArea" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RutBottomDistance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RutWidthRight" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RutWidthLeft" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RutDepthRight15" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RutDepthRight17" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RutDepthMax15" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RutDepthMax17" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RutDepthLeft17" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CrossfallRutBottom" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="WaterArea" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Deleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementData20", propOrder = {
    "county",
    "roadMainNumber",
    "roadSubNumber",
    "direction",
    "lane",
    "startContinuousLength",
    "endContinuousLength",
    "length",
    "measurementDate",
    "measurementDateSpecific",
    "measurementDataType",
    "iriLeft",
    "iriRight",
    "measurementVehicleSpeed",
    "hilliness",
    "curvature",
    "edgeDepth",
    "megatextureRight",
    "megatextureLeft",
    "mpdMacrotextureRight",
    "mpdMacrotextureMiddle",
    "mpdMacrotextureLeft",
    "rutArea",
    "rutBottomDistance",
    "rutWidthRight",
    "rutWidthLeft",
    "rutDepthRight15",
    "rutDepthRight17",
    "rutDepthMax15",
    "rutDepthMax17",
    "rutDepthLeft17",
    "crossfallRutBottom",
    "waterArea",
    "timeStamp",
    "modifiedTime",
    "deleted"
})
public class MeasurementData20 {

    @XmlElement(name = "County")
    protected int county;
    @XmlElement(name = "RoadMainNumber")
    protected int roadMainNumber;
    @XmlElement(name = "RoadSubNumber")
    protected int roadSubNumber;
    @XmlElement(name = "Direction")
    protected Direction direction;
    @XmlElement(name = "Lane")
    protected int lane;
    @XmlElement(name = "StartContinuousLength")
    protected int startContinuousLength;
    @XmlElement(name = "EndContinuousLength")
    protected int endContinuousLength;
    @XmlElement(name = "Length")
    protected int length;
    @XmlElement(name = "MeasurementDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementDate;
    @XmlElement(name = "MeasurementDateSpecific", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementDateSpecific;
    @XmlElement(name = "MeasurementDataType")
    protected MeasurementDataType measurementDataType;
    @XmlElement(name = "IRILeft")
    protected double iriLeft;
    @XmlElement(name = "IRIRight")
    protected double iriRight;
    @XmlElement(name = "MeasurementVehicleSpeed")
    protected double measurementVehicleSpeed;
    @XmlElement(name = "Hilliness")
    protected double hilliness;
    @XmlElement(name = "Curvature")
    protected double curvature;
    @XmlElement(name = "EdgeDepth")
    protected double edgeDepth;
    @XmlElement(name = "MegatextureRight")
    protected double megatextureRight;
    @XmlElement(name = "MegatextureLeft")
    protected double megatextureLeft;
    @XmlElement(name = "MPDMacrotextureRight")
    protected double mpdMacrotextureRight;
    @XmlElement(name = "MPDMacrotextureMiddle")
    protected double mpdMacrotextureMiddle;
    @XmlElement(name = "MPDMacrotextureLeft")
    protected double mpdMacrotextureLeft;
    @XmlElement(name = "RutArea")
    protected double rutArea;
    @XmlElement(name = "RutBottomDistance")
    protected double rutBottomDistance;
    @XmlElement(name = "RutWidthRight")
    protected double rutWidthRight;
    @XmlElement(name = "RutWidthLeft")
    protected double rutWidthLeft;
    @XmlElement(name = "RutDepthRight15")
    protected double rutDepthRight15;
    @XmlElement(name = "RutDepthRight17")
    protected double rutDepthRight17;
    @XmlElement(name = "RutDepthMax15")
    protected double rutDepthMax15;
    @XmlElement(name = "RutDepthMax17")
    protected double rutDepthMax17;
    @XmlElement(name = "RutDepthLeft17")
    protected double rutDepthLeft17;
    @XmlElement(name = "CrossfallRutBottom")
    protected double crossfallRutBottom;
    @XmlElement(name = "WaterArea")
    protected double waterArea;
    @XmlElement(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(name = "ModifiedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedTime;
    @XmlElement(name = "Deleted")
    protected Boolean deleted;

    /**
     * Gets the value of the county property.
     * 
     */
    public int getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     */
    public void setCounty(int value) {
        this.county = value;
    }

    /**
     * Gets the value of the roadMainNumber property.
     * 
     */
    public int getRoadMainNumber() {
        return roadMainNumber;
    }

    /**
     * Sets the value of the roadMainNumber property.
     * 
     */
    public void setRoadMainNumber(int value) {
        this.roadMainNumber = value;
    }

    /**
     * Gets the value of the roadSubNumber property.
     * 
     */
    public int getRoadSubNumber() {
        return roadSubNumber;
    }

    /**
     * Sets the value of the roadSubNumber property.
     * 
     */
    public void setRoadSubNumber(int value) {
        this.roadSubNumber = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Direction }
     *     
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction }
     *     
     */
    public void setDirection(Direction value) {
        this.direction = value;
    }

    /**
     * Gets the value of the lane property.
     * 
     */
    public int getLane() {
        return lane;
    }

    /**
     * Sets the value of the lane property.
     * 
     */
    public void setLane(int value) {
        this.lane = value;
    }

    /**
     * Gets the value of the startContinuousLength property.
     * 
     */
    public int getStartContinuousLength() {
        return startContinuousLength;
    }

    /**
     * Sets the value of the startContinuousLength property.
     * 
     */
    public void setStartContinuousLength(int value) {
        this.startContinuousLength = value;
    }

    /**
     * Gets the value of the endContinuousLength property.
     * 
     */
    public int getEndContinuousLength() {
        return endContinuousLength;
    }

    /**
     * Sets the value of the endContinuousLength property.
     * 
     */
    public void setEndContinuousLength(int value) {
        this.endContinuousLength = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Gets the value of the measurementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementDate() {
        return measurementDate;
    }

    /**
     * Sets the value of the measurementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementDate(XMLGregorianCalendar value) {
        this.measurementDate = value;
    }

    /**
     * Gets the value of the measurementDateSpecific property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementDateSpecific() {
        return measurementDateSpecific;
    }

    /**
     * Sets the value of the measurementDateSpecific property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementDateSpecific(XMLGregorianCalendar value) {
        this.measurementDateSpecific = value;
    }

    /**
     * Gets the value of the measurementDataType property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementDataType }
     *     
     */
    public MeasurementDataType getMeasurementDataType() {
        return measurementDataType;
    }

    /**
     * Sets the value of the measurementDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementDataType }
     *     
     */
    public void setMeasurementDataType(MeasurementDataType value) {
        this.measurementDataType = value;
    }

    /**
     * Gets the value of the iriLeft property.
     * 
     */
    public double getIRILeft() {
        return iriLeft;
    }

    /**
     * Sets the value of the iriLeft property.
     * 
     */
    public void setIRILeft(double value) {
        this.iriLeft = value;
    }

    /**
     * Gets the value of the iriRight property.
     * 
     */
    public double getIRIRight() {
        return iriRight;
    }

    /**
     * Sets the value of the iriRight property.
     * 
     */
    public void setIRIRight(double value) {
        this.iriRight = value;
    }

    /**
     * Gets the value of the measurementVehicleSpeed property.
     * 
     */
    public double getMeasurementVehicleSpeed() {
        return measurementVehicleSpeed;
    }

    /**
     * Sets the value of the measurementVehicleSpeed property.
     * 
     */
    public void setMeasurementVehicleSpeed(double value) {
        this.measurementVehicleSpeed = value;
    }

    /**
     * Gets the value of the hilliness property.
     * 
     */
    public double getHilliness() {
        return hilliness;
    }

    /**
     * Sets the value of the hilliness property.
     * 
     */
    public void setHilliness(double value) {
        this.hilliness = value;
    }

    /**
     * Gets the value of the curvature property.
     * 
     */
    public double getCurvature() {
        return curvature;
    }

    /**
     * Sets the value of the curvature property.
     * 
     */
    public void setCurvature(double value) {
        this.curvature = value;
    }

    /**
     * Gets the value of the edgeDepth property.
     * 
     */
    public double getEdgeDepth() {
        return edgeDepth;
    }

    /**
     * Sets the value of the edgeDepth property.
     * 
     */
    public void setEdgeDepth(double value) {
        this.edgeDepth = value;
    }

    /**
     * Gets the value of the megatextureRight property.
     * 
     */
    public double getMegatextureRight() {
        return megatextureRight;
    }

    /**
     * Sets the value of the megatextureRight property.
     * 
     */
    public void setMegatextureRight(double value) {
        this.megatextureRight = value;
    }

    /**
     * Gets the value of the megatextureLeft property.
     * 
     */
    public double getMegatextureLeft() {
        return megatextureLeft;
    }

    /**
     * Sets the value of the megatextureLeft property.
     * 
     */
    public void setMegatextureLeft(double value) {
        this.megatextureLeft = value;
    }

    /**
     * Gets the value of the mpdMacrotextureRight property.
     * 
     */
    public double getMPDMacrotextureRight() {
        return mpdMacrotextureRight;
    }

    /**
     * Sets the value of the mpdMacrotextureRight property.
     * 
     */
    public void setMPDMacrotextureRight(double value) {
        this.mpdMacrotextureRight = value;
    }

    /**
     * Gets the value of the mpdMacrotextureMiddle property.
     * 
     */
    public double getMPDMacrotextureMiddle() {
        return mpdMacrotextureMiddle;
    }

    /**
     * Sets the value of the mpdMacrotextureMiddle property.
     * 
     */
    public void setMPDMacrotextureMiddle(double value) {
        this.mpdMacrotextureMiddle = value;
    }

    /**
     * Gets the value of the mpdMacrotextureLeft property.
     * 
     */
    public double getMPDMacrotextureLeft() {
        return mpdMacrotextureLeft;
    }

    /**
     * Sets the value of the mpdMacrotextureLeft property.
     * 
     */
    public void setMPDMacrotextureLeft(double value) {
        this.mpdMacrotextureLeft = value;
    }

    /**
     * Gets the value of the rutArea property.
     * 
     */
    public double getRutArea() {
        return rutArea;
    }

    /**
     * Sets the value of the rutArea property.
     * 
     */
    public void setRutArea(double value) {
        this.rutArea = value;
    }

    /**
     * Gets the value of the rutBottomDistance property.
     * 
     */
    public double getRutBottomDistance() {
        return rutBottomDistance;
    }

    /**
     * Sets the value of the rutBottomDistance property.
     * 
     */
    public void setRutBottomDistance(double value) {
        this.rutBottomDistance = value;
    }

    /**
     * Gets the value of the rutWidthRight property.
     * 
     */
    public double getRutWidthRight() {
        return rutWidthRight;
    }

    /**
     * Sets the value of the rutWidthRight property.
     * 
     */
    public void setRutWidthRight(double value) {
        this.rutWidthRight = value;
    }

    /**
     * Gets the value of the rutWidthLeft property.
     * 
     */
    public double getRutWidthLeft() {
        return rutWidthLeft;
    }

    /**
     * Sets the value of the rutWidthLeft property.
     * 
     */
    public void setRutWidthLeft(double value) {
        this.rutWidthLeft = value;
    }

    /**
     * Gets the value of the rutDepthRight15 property.
     * 
     */
    public double getRutDepthRight15() {
        return rutDepthRight15;
    }

    /**
     * Sets the value of the rutDepthRight15 property.
     * 
     */
    public void setRutDepthRight15(double value) {
        this.rutDepthRight15 = value;
    }

    /**
     * Gets the value of the rutDepthRight17 property.
     * 
     */
    public double getRutDepthRight17() {
        return rutDepthRight17;
    }

    /**
     * Sets the value of the rutDepthRight17 property.
     * 
     */
    public void setRutDepthRight17(double value) {
        this.rutDepthRight17 = value;
    }

    /**
     * Gets the value of the rutDepthMax15 property.
     * 
     */
    public double getRutDepthMax15() {
        return rutDepthMax15;
    }

    /**
     * Sets the value of the rutDepthMax15 property.
     * 
     */
    public void setRutDepthMax15(double value) {
        this.rutDepthMax15 = value;
    }

    /**
     * Gets the value of the rutDepthMax17 property.
     * 
     */
    public double getRutDepthMax17() {
        return rutDepthMax17;
    }

    /**
     * Sets the value of the rutDepthMax17 property.
     * 
     */
    public void setRutDepthMax17(double value) {
        this.rutDepthMax17 = value;
    }

    /**
     * Gets the value of the rutDepthLeft17 property.
     * 
     */
    public double getRutDepthLeft17() {
        return rutDepthLeft17;
    }

    /**
     * Sets the value of the rutDepthLeft17 property.
     * 
     */
    public void setRutDepthLeft17(double value) {
        this.rutDepthLeft17 = value;
    }

    /**
     * Gets the value of the crossfallRutBottom property.
     * 
     */
    public double getCrossfallRutBottom() {
        return crossfallRutBottom;
    }

    /**
     * Sets the value of the crossfallRutBottom property.
     * 
     */
    public void setCrossfallRutBottom(double value) {
        this.crossfallRutBottom = value;
    }

    /**
     * Gets the value of the waterArea property.
     * 
     */
    public double getWaterArea() {
        return waterArea;
    }

    /**
     * Sets the value of the waterArea property.
     * 
     */
    public void setWaterArea(double value) {
        this.waterArea = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the modifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedTime() {
        return modifiedTime;
    }

    /**
     * Sets the value of the modifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedTime(XMLGregorianCalendar value) {
        this.modifiedTime = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleted(Boolean value) {
        this.deleted = value;
    }

}
