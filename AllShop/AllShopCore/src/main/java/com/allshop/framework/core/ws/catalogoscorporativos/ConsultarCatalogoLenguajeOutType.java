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
 * ConsultarCatalogoLenguajeOutType
 * 			
 * 
 * <p>Java class for ConsultarCatalogoLenguajeOutType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarCatalogoLenguajeOutType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CatalogoLenguaje" type="{http://www.allshop.com/framework/core/ws/CatalogosCorporativos}CatalogoLenguaje"/>
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
@XmlType(name = "ConsultarCatalogoLenguajeOutType", propOrder = {
    "catalogoLenguaje",
    "estatusComun"
})
public class ConsultarCatalogoLenguajeOutType {

    @XmlElement(name = "CatalogoLenguaje", required = true)
    protected CatalogoLenguaje catalogoLenguaje;
    @XmlElement(name = "EstatusComun", required = true)
    protected EstatusComun estatusComun;

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
