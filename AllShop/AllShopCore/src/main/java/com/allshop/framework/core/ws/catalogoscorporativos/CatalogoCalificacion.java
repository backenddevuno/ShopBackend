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
import javax.xml.bind.annotation.XmlType;
import com.allshop.framework.core.ws.common.elementoscomunes.ElementosComunes;


/**
 * <p>Java class for CatalogoCalificacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogoCalificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LangTpCd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="9999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IdCalificacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="9999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DescCalificacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="255"/>
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
@XmlType(name = "CatalogoCalificacion", propOrder = {
    "langTpCd",
    "idCalificacion",
    "descCalificacion",
    "elementosComunes"
})
public class CatalogoCalificacion {

    @XmlElement(name = "LangTpCd")
    protected long langTpCd;
    @XmlElement(name = "IdCalificacion")
    protected long idCalificacion;
    @XmlElement(name = "DescCalificacion", required = true)
    protected String descCalificacion;
    @XmlElement(name = "ElementosComunes", required = true)
    protected ElementosComunes elementosComunes;

    /**
     * Gets the value of the langTpCd property.
     * 
     */
    public long getLangTpCd() {
        return langTpCd;
    }

    /**
     * Sets the value of the langTpCd property.
     * 
     */
    public void setLangTpCd(long value) {
        this.langTpCd = value;
    }

    /**
     * Gets the value of the idCalificacion property.
     * 
     */
    public long getIdCalificacion() {
        return idCalificacion;
    }

    /**
     * Sets the value of the idCalificacion property.
     * 
     */
    public void setIdCalificacion(long value) {
        this.idCalificacion = value;
    }

    /**
     * Gets the value of the descCalificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCalificacion() {
        return descCalificacion;
    }

    /**
     * Sets the value of the descCalificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCalificacion(String value) {
        this.descCalificacion = value;
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
