//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 06:14:45 PM CDT 
//


package com.allshop.framework.core.ws.catalogoscorporativos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CatalogoCuenta" type="{http://www.allshop.com/framework/core/ws/CatalogosCorporativos}CatalogoCuenta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "catalogoCuenta"
})
@XmlRootElement(name = "CrearCatalogoCuentaOut")
public class CrearCatalogoCuentaOut {

    @XmlElement(name = "CatalogoCuenta")
    protected CatalogoCuenta catalogoCuenta;

    /**
     * Gets the value of the catalogoCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogoCuenta }
     *     
     */
    public CatalogoCuenta getCatalogoCuenta() {
        return catalogoCuenta;
    }

    /**
     * Sets the value of the catalogoCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogoCuenta }
     *     
     */
    public void setCatalogoCuenta(CatalogoCuenta value) {
        this.catalogoCuenta = value;
    }

}
