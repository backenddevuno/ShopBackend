//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.18 at 01:42:38 PM CDT 
//


package com.allshop.framework.core.ws.common.excepciongeneral;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.allshop.framework.core.ws.common.excepciongeneral package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Excepcion_QNAME = new QName("http://www.allshop.com/framework/core/ws/common/ExcepcionGeneral", "Excepcion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.allshop.framework.core.ws.common.excepciongeneral
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExcepcionGenericaType }
     * 
     */
    public ExcepcionGenericaType createExcepcionGenericaType() {
        return new ExcepcionGenericaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcepcionGenericaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.allshop.com/framework/core/ws/common/ExcepcionGeneral", name = "Excepcion")
    public JAXBElement<ExcepcionGenericaType> createExcepcion(ExcepcionGenericaType value) {
        return new JAXBElement<ExcepcionGenericaType>(_Excepcion_QNAME, ExcepcionGenericaType.class, null, value);
    }

}
