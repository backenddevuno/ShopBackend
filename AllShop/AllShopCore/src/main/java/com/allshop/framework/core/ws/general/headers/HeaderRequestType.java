//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.15 at 11:05:44 PM CDT 
//


package com.allshop.framework.core.ws.general.headers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * -Elemento Base que
 * 				define los elementos genericos del Header Request
 * 				--ATRIBUTOS--
 * 				-locale: Informacion de localizacion del peticionario
 * 				-CodIdioma:
 * 				Formato de codificacion de caracteres
 * 
 * <p>Java class for HeaderRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Despliegue" type="{http://www.allshop.com/framework/core/ws/general/Headers}DespliegueType" minOccurs="0"/>
 *         &lt;element name="Acceso" type="{http://www.allshop.com/framework/core/ws/general/Headers}AccesoType"/>
 *         &lt;element name="Consumidor" type="{http://www.allshop.com/framework/core/ws/general/Headers}ConsumidorType"/>
 *         &lt;element name="DatosPeticion" type="{http://www.allshop.com/framework/core/ws/general/Headers}RequestType"/>
 *         &lt;element name="DatosVariables" type="{http://www.allshop.com/framework/core/ws/general/Headers}DatosVariablesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="locale">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="codIdioma">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderRequestType", propOrder = {
    "despliegue",
    "acceso",
    "consumidor",
    "datosPeticion",
    "datosVariables"
})
public class HeaderRequestType {

    @XmlElement(name = "Despliegue")
    protected DespliegueType despliegue;
    @XmlElement(name = "Acceso", required = true)
    protected AccesoType acceso;
    @XmlElement(name = "Consumidor", required = true)
    protected ConsumidorType consumidor;
    @XmlElement(name = "DatosPeticion", required = true)
    protected RequestType datosPeticion;
    @XmlElement(name = "DatosVariables")
    protected DatosVariablesType datosVariables;
    @XmlAttribute(name = "locale")
    protected String locale;
    @XmlAttribute(name = "codIdioma")
    protected String codIdioma;

    /**
     * Gets the value of the despliegue property.
     * 
     * @return
     *     possible object is
     *     {@link DespliegueType }
     *     
     */
    public DespliegueType getDespliegue() {
        return despliegue;
    }

    /**
     * Sets the value of the despliegue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DespliegueType }
     *     
     */
    public void setDespliegue(DespliegueType value) {
        this.despliegue = value;
    }

    /**
     * Gets the value of the acceso property.
     * 
     * @return
     *     possible object is
     *     {@link AccesoType }
     *     
     */
    public AccesoType getAcceso() {
        return acceso;
    }

    /**
     * Sets the value of the acceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccesoType }
     *     
     */
    public void setAcceso(AccesoType value) {
        this.acceso = value;
    }

    /**
     * Gets the value of the consumidor property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumidorType }
     *     
     */
    public ConsumidorType getConsumidor() {
        return consumidor;
    }

    /**
     * Sets the value of the consumidor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumidorType }
     *     
     */
    public void setConsumidor(ConsumidorType value) {
        this.consumidor = value;
    }

    /**
     * Gets the value of the datosPeticion property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getDatosPeticion() {
        return datosPeticion;
    }

    /**
     * Sets the value of the datosPeticion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setDatosPeticion(RequestType value) {
        this.datosPeticion = value;
    }

    /**
     * Gets the value of the datosVariables property.
     * 
     * @return
     *     possible object is
     *     {@link DatosVariablesType }
     *     
     */
    public DatosVariablesType getDatosVariables() {
        return datosVariables;
    }

    /**
     * Sets the value of the datosVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosVariablesType }
     *     
     */
    public void setDatosVariables(DatosVariablesType value) {
        this.datosVariables = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the codIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodIdioma() {
        return codIdioma;
    }

    /**
     * Sets the value of the codIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodIdioma(String value) {
        this.codIdioma = value;
    }

}
