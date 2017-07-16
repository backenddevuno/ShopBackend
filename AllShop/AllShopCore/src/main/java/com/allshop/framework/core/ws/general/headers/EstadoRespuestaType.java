//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.16 at 01:21:45 AM CDT 
//


package com.allshop.framework.core.ws.general.headers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstadoRespuestaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstadoRespuestaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MensajeAUsuario" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MensajeDetallado" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NivelSegRequerido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstadoRespuestaType", propOrder = {
    "id",
    "mensajeAUsuario",
    "mensajeDetallado",
    "nivelSegRequerido"
})
public class EstadoRespuestaType {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "MensajeAUsuario")
    protected String mensajeAUsuario;
    @XmlElement(name = "MensajeDetallado")
    protected String mensajeDetallado;
    @XmlElement(name = "NivelSegRequerido")
    protected Integer nivelSegRequerido;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the mensajeAUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeAUsuario() {
        return mensajeAUsuario;
    }

    /**
     * Sets the value of the mensajeAUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeAUsuario(String value) {
        this.mensajeAUsuario = value;
    }

    /**
     * Gets the value of the mensajeDetallado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeDetallado() {
        return mensajeDetallado;
    }

    /**
     * Sets the value of the mensajeDetallado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeDetallado(String value) {
        this.mensajeDetallado = value;
    }

    /**
     * Gets the value of the nivelSegRequerido property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelSegRequerido() {
        return nivelSegRequerido;
    }

    /**
     * Sets the value of the nivelSegRequerido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelSegRequerido(Integer value) {
        this.nivelSegRequerido = value;
    }

}
