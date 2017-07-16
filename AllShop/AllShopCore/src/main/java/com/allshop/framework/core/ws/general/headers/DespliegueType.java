//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.15 at 11:05:44 PM CDT 
//


package com.allshop.framework.core.ws.general.headers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DespliegueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DespliegueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dispositivo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MarcaDispositivo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Navegador" type="{http://www.allshop.com/framework/core/ws/general/Headers}NavegadorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DespliegueType", propOrder = {
    "dispositivo",
    "marcaDispositivo",
    "navegador"
})
public class DespliegueType {

    @XmlElement(name = "Dispositivo")
    protected String dispositivo;
    @XmlElement(name = "MarcaDispositivo")
    protected String marcaDispositivo;
    @XmlElement(name = "Navegador")
    protected NavegadorType navegador;

    /**
     * Gets the value of the dispositivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositivo() {
        return dispositivo;
    }

    /**
     * Sets the value of the dispositivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositivo(String value) {
        this.dispositivo = value;
    }

    /**
     * Gets the value of the marcaDispositivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaDispositivo() {
        return marcaDispositivo;
    }

    /**
     * Sets the value of the marcaDispositivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaDispositivo(String value) {
        this.marcaDispositivo = value;
    }

    /**
     * Gets the value of the navegador property.
     * 
     * @return
     *     possible object is
     *     {@link NavegadorType }
     *     
     */
    public NavegadorType getNavegador() {
        return navegador;
    }

    /**
     * Sets the value of the navegador property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavegadorType }
     *     
     */
    public void setNavegador(NavegadorType value) {
        this.navegador = value;
    }

}
