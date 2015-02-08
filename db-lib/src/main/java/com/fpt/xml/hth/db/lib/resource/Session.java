//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.05 at 10:42:55 PM ICT 
//


package com.fpt.xml.hth.db.lib.resource;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Session complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Session"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="show_time" type="{}show-time"/&gt;
 *         &lt;element name="movie_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="theater" type="{}Theater"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Session", propOrder = {
    "id",
    "showTime",
    "movie_name",
    "theater"
})
public class Session {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(name = "show_time", required = true)
    protected BigInteger showTime;
    @XmlElement(required = true)
    protected String movie_name;
    @XmlElement(required = true)
    protected Theater theater;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the showTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShowTime() {
        return showTime;
    }

    /**
     * Sets the value of the showTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShowTime(BigInteger value) {
        this.showTime = value;
    }

    /**
     * Gets the value of the movie_name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovie() {
        return movie_name;
    }

    /**
     * Sets the value of the movie_name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovie(String value) {
        this.movie_name = value;
    }

    /**
     * Gets the value of the theater property.
     * 
     * @return
     *     possible object is
     *     {@link Theater }
     *     
     */
    public Theater getTheater() {
        return theater;
    }

    /**
     * Sets the value of the theater property.
     * 
     * @param value
     *     allowed object is
     *     {@link Theater }
     *     
     */
    public void setTheater(Theater value) {
        this.theater = value;
    }

}
