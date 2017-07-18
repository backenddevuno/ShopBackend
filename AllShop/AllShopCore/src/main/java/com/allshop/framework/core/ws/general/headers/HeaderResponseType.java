//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.18 at 01:42:38 PM CDT 
//


package com.allshop.framework.core.ws.general.headers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HeaderResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdOperacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="36"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumReferencia" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="48"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalOcurrencias" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minExclusive value="0"/>
 *               &lt;maxExclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EstadoRespuesta" type="{http://www.allshop.com/framework/core/ws/general/Headers}EstadoRespuestaType"/>
 *         &lt;element name="TokenOperacion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="fechaHora" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderResponseType", propOrder = {
    "idOperacion",
    "numReferencia",
    "totalOcurrencias",
    "estadoRespuesta",
    "tokenOperacion"
})
public class HeaderResponseType {

    @XmlElement(name = "IdOperacion", required = true)
    protected String idOperacion;
    @XmlElement(name = "NumReferencia")
    protected String numReferencia;
    @XmlElement(name = "TotalOcurrencias")
    protected Integer totalOcurrencias;
    @XmlElement(name = "EstadoRespuesta", required = true)
    protected EstadoRespuestaType estadoRespuesta;
    @XmlElement(name = "TokenOperacion")
    protected String tokenOperacion;
    @XmlAttribute(name = "fechaHora")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHora;

    /**
     * Gets the value of the idOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOperacion() {
        return idOperacion;
    }

    /**
     * Sets the value of the idOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOperacion(String value) {
        this.idOperacion = value;
    }

    /**
     * Gets the value of the numReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumReferencia() {
        return numReferencia;
    }

    /**
     * Sets the value of the numReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumReferencia(String value) {
        this.numReferencia = value;
    }

    /**
     * Gets the value of the totalOcurrencias property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalOcurrencias() {
        return totalOcurrencias;
    }

    /**
     * Sets the value of the totalOcurrencias property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalOcurrencias(Integer value) {
        this.totalOcurrencias = value;
    }

    /**
     * Gets the value of the estadoRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoRespuestaType }
     *     
     */
    public EstadoRespuestaType getEstadoRespuesta() {
        return estadoRespuesta;
    }

    /**
     * Sets the value of the estadoRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoRespuestaType }
     *     
     */
    public void setEstadoRespuesta(EstadoRespuestaType value) {
        this.estadoRespuesta = value;
    }

    /**
     * Gets the value of the tokenOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenOperacion() {
        return tokenOperacion;
    }

    /**
     * Sets the value of the tokenOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenOperacion(String value) {
        this.tokenOperacion = value;
    }

    /**
     * Gets the value of the fechaHora property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHora() {
        return fechaHora;
    }

    /**
     * Sets the value of the fechaHora property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHora(XMLGregorianCalendar value) {
        this.fechaHora = value;
    }

}
