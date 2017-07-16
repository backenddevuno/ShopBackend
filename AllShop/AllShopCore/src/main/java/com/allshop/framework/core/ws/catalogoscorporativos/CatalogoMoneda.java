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
import javax.xml.bind.annotation.XmlType;
import com.allshop.framework.core.ws.common.elementoscomunes.ElementosComunes;


/**
 * <p>Java class for CatalogoMoneda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogoMoneda">
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
 *         &lt;element name="IdMoneda">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="9999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CodMoneda">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DescMoneda">
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
@XmlType(name = "CatalogoMoneda", propOrder = {
    "langTpCd",
    "idMoneda",
    "codMoneda",
    "descMoneda",
    "elementosComunes"
})
public class CatalogoMoneda {

    @XmlElement(name = "LangTpCd")
    protected long langTpCd;
    @XmlElement(name = "IdMoneda")
    protected long idMoneda;
    @XmlElement(name = "CodMoneda", required = true)
    protected String codMoneda;
    @XmlElement(name = "DescMoneda", required = true)
    protected String descMoneda;
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
     * Gets the value of the idMoneda property.
     * 
     */
    public long getIdMoneda() {
        return idMoneda;
    }

    /**
     * Sets the value of the idMoneda property.
     * 
     */
    public void setIdMoneda(long value) {
        this.idMoneda = value;
    }

    /**
     * Gets the value of the codMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMoneda() {
        return codMoneda;
    }

    /**
     * Sets the value of the codMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMoneda(String value) {
        this.codMoneda = value;
    }

    /**
     * Gets the value of the descMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMoneda() {
        return descMoneda;
    }

    /**
     * Sets the value of the descMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMoneda(String value) {
        this.descMoneda = value;
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
