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
import com.allshop.framework.core.ws.common.estatuscomunes.EstatusComun;


/**
 * ConsultarCatalogoDesarrolloOutType
 * 			
 * 
 * <p>Java class for ConsultarCatalogoDesarrolloOutType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarCatalogoDesarrolloOutType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CatalogoDesarrollo" type="{http://www.allshop.com/framework/core/ws/CatalogosCorporativos}CatalogoDesarrollo"/>
 *         &lt;element name="EstatusComun" type="{http://www.allshop.com/framework/core/ws/common/EstatusComunes}EstatusComun"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCatalogoDesarrolloOutType", propOrder = {
    "catalogoDesarrollo",
    "estatusComun"
})
public class ConsultarCatalogoDesarrolloOutType {

    @XmlElement(name = "CatalogoDesarrollo", required = true)
    protected CatalogoDesarrollo catalogoDesarrollo;
    @XmlElement(name = "EstatusComun", required = true)
    protected EstatusComun estatusComun;

    /**
     * Gets the value of the catalogoDesarrollo property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogoDesarrollo }
     *     
     */
    public CatalogoDesarrollo getCatalogoDesarrollo() {
        return catalogoDesarrollo;
    }

    /**
     * Sets the value of the catalogoDesarrollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogoDesarrollo }
     *     
     */
    public void setCatalogoDesarrollo(CatalogoDesarrollo value) {
        this.catalogoDesarrollo = value;
    }

    /**
     * Gets the value of the estatusComun property.
     * 
     * @return
     *     possible object is
     *     {@link EstatusComun }
     *     
     */
    public EstatusComun getEstatusComun() {
        return estatusComun;
    }

    /**
     * Sets the value of the estatusComun property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstatusComun }
     *     
     */
    public void setEstatusComun(EstatusComun value) {
        this.estatusComun = value;
    }

}