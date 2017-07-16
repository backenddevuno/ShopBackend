//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.15 at 11:05:44 PM CDT 
//


package com.allshop.framework.core.ws.catalogoscorporativos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.allshop.framework.core.ws.common.elementoscomunes.ElementosComunes;


/**
 * <p>Java class for CatalogoDesarrollo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogoDesarrollo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LangTpCd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IdDesarrollo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CodDesarrollo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DescDesarrollo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ElementosComunes" type="{http://www.allshop.com/framework/core/ws/common/ElementosComunes}ElementosComunes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogoDesarrollo", propOrder = {
    "langTpCd",
    "idDesarrollo",
    "codDesarrollo",
    "descDesarrollo",
    "elementosComunes"
})
public class CatalogoDesarrollo {

    @XmlElement(name = "LangTpCd", required = true)
    protected String langTpCd;
    @XmlElement(name = "IdDesarrollo", required = true)
    protected String idDesarrollo;
    @XmlElement(name = "CodDesarrollo", required = true)
    protected String codDesarrollo;
    @XmlElement(name = "DescDesarrollo", required = true)
    protected String descDesarrollo;
    @XmlElement(name = "ElementosComunes", required = true)
    protected ElementosComunes elementosComunes;

    /**
     * Gets the value of the langTpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangTpCd() {
        return langTpCd;
    }

    /**
     * Sets the value of the langTpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangTpCd(String value) {
        this.langTpCd = value;
    }

    /**
     * Gets the value of the idDesarrollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDesarrollo() {
        return idDesarrollo;
    }

    /**
     * Sets the value of the idDesarrollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDesarrollo(String value) {
        this.idDesarrollo = value;
    }

    /**
     * Gets the value of the codDesarrollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDesarrollo() {
        return codDesarrollo;
    }

    /**
     * Sets the value of the codDesarrollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDesarrollo(String value) {
        this.codDesarrollo = value;
    }

    /**
     * Gets the value of the descDesarrollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDesarrollo() {
        return descDesarrollo;
    }

    /**
     * Sets the value of the descDesarrollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDesarrollo(String value) {
        this.descDesarrollo = value;
    }

    /**
     * Gets the value of the elementosComunes property.
     * 
     * @return
     *     possible object is
     *     {@link ElementosComunes }
     *     
     */
    public ElementosComunes getElementosComunes() {
        return elementosComunes;
    }

    /**
     * Sets the value of the elementosComunes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementosComunes }
     *     
     */
    public void setElementosComunes(ElementosComunes value) {
        this.elementosComunes = value;
    }

}