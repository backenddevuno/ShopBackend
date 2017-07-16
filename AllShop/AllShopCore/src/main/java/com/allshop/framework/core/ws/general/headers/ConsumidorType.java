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
 * <p>Java class for ConsumidorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumidorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IpServer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IpCliente">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TipoCanal">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IdAplicacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumidorType", propOrder = {
    "ipServer",
    "ipCliente",
    "tipoCanal",
    "idAplicacion"
})
public class ConsumidorType {

    @XmlElement(name = "IpServer", required = true)
    protected String ipServer;
    @XmlElement(name = "IpCliente", required = true)
    protected String ipCliente;
    @XmlElement(name = "TipoCanal", required = true)
    protected String tipoCanal;
    @XmlElement(name = "IdAplicacion", required = true)
    protected String idAplicacion;

    /**
     * Gets the value of the ipServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpServer() {
        return ipServer;
    }

    /**
     * Sets the value of the ipServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpServer(String value) {
        this.ipServer = value;
    }

    /**
     * Gets the value of the ipCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpCliente() {
        return ipCliente;
    }

    /**
     * Sets the value of the ipCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpCliente(String value) {
        this.ipCliente = value;
    }

    /**
     * Gets the value of the tipoCanal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCanal() {
        return tipoCanal;
    }

    /**
     * Sets the value of the tipoCanal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCanal(String value) {
        this.tipoCanal = value;
    }

    /**
     * Gets the value of the idAplicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAplicacion() {
        return idAplicacion;
    }

    /**
     * Sets the value of the idAplicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAplicacion(String value) {
        this.idAplicacion = value;
    }

}