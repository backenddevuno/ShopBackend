//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.15 at 11:05:44 PM CDT 
//


package com.allshop.framework.core.ws.common.excepciongeneral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcepcionGenericaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcepcionGenericaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Componente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Metodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcepcionGenericaType", propOrder = {
    "codigo",
    "componente",
    "metodo",
    "descripcion"
})
public class ExcepcionGenericaType {

    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "Componente")
    protected String componente;
    @XmlElement(name = "Metodo")
    protected String metodo;
    @XmlElement(name = "Descripcion", required = true)
    protected String descripcion;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the componente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponente() {
        return componente;
    }

    /**
     * Sets the value of the componente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponente(String value) {
        this.componente = value;
    }

    /**
     * Gets the value of the metodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodo() {
        return metodo;
    }

    /**
     * Sets the value of the metodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodo(String value) {
        this.metodo = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

}
