//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.16 at 01:21:45 AM CDT 
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
 *         &lt;element name="CatalogoLenguaje" type="{http://www.allshop.com/framework/core/ws/CatalogosCorporativos}CatalogoLenguaje" minOccurs="0"/>
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
    "catalogoLenguaje"
})
@XmlRootElement(name = "CrearCatalogoLenguajeOut")
public class CrearCatalogoLenguajeOut {

    @XmlElement(name = "CatalogoLenguaje")
    protected CatalogoLenguaje catalogoLenguaje;

    /**
     * Gets the value of the catalogoLenguaje property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogoLenguaje }
     *     
     */
    public CatalogoLenguaje getCatalogoLenguaje() {
        return catalogoLenguaje;
    }

    /**
     * Sets the value of the catalogoLenguaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogoLenguaje }
     *     
     */
    public void setCatalogoLenguaje(CatalogoLenguaje value) {
        this.catalogoLenguaje = value;
    }

}
