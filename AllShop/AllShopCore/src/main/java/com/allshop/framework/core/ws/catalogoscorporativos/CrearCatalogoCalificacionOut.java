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
 *         &lt;element name="CatalogoCalificacion" type="{http://www.allshop.com/framework/core/ws/CatalogosCorporativos}CatalogoCalificacion" minOccurs="0"/>
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
    "catalogoCalificacion"
})
@XmlRootElement(name = "CrearCatalogoCalificacionOut")
public class CrearCatalogoCalificacionOut {

    @XmlElement(name = "CatalogoCalificacion")
    protected CatalogoCalificacion catalogoCalificacion;

    /**
     * Gets the value of the catalogoCalificacion property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogoCalificacion }
     *     
     */
    public CatalogoCalificacion getCatalogoCalificacion() {
        return catalogoCalificacion;
    }

    /**
     * Sets the value of the catalogoCalificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogoCalificacion }
     *     
     */
    public void setCatalogoCalificacion(CatalogoCalificacion value) {
        this.catalogoCalificacion = value;
    }

}
