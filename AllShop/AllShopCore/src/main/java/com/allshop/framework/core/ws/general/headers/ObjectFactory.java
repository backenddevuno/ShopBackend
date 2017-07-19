//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 06:14:45 PM CDT 
//


package com.allshop.framework.core.ws.general.headers;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.allshop.framework.core.ws.general.headers package. 
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

    private final static QName _HeaderReq_QNAME = new QName("http://www.allshop.com/framework/core/ws/general/Headers", "HeaderReq");
    private final static QName _HeaderRes_QNAME = new QName("http://www.allshop.com/framework/core/ws/general/Headers", "HeaderRes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.allshop.framework.core.ws.general.headers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PropiedadType }
     * 
     */
    public PropiedadType createPropiedadType() {
        return new PropiedadType();
    }

    /**
     * Create an instance of {@link EstadoRespuestaType }
     * 
     */
    public EstadoRespuestaType createEstadoRespuestaType() {
        return new EstadoRespuestaType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link DespliegueType }
     * 
     */
    public DespliegueType createDespliegueType() {
        return new DespliegueType();
    }

    /**
     * Create an instance of {@link DatosVariablesType }
     * 
     */
    public DatosVariablesType createDatosVariablesType() {
        return new DatosVariablesType();
    }

    /**
     * Create an instance of {@link TransaccionType }
     * 
     */
    public TransaccionType createTransaccionType() {
        return new TransaccionType();
    }

    /**
     * Create an instance of {@link HeaderRequestType }
     * 
     */
    public HeaderRequestType createHeaderRequestType() {
        return new HeaderRequestType();
    }

    /**
     * Create an instance of {@link ConsumidorType }
     * 
     */
    public ConsumidorType createConsumidorType() {
        return new ConsumidorType();
    }

    /**
     * Create an instance of {@link AccesoType }
     * 
     */
    public AccesoType createAccesoType() {
        return new AccesoType();
    }

    /**
     * Create an instance of {@link NavegadorType }
     * 
     */
    public NavegadorType createNavegadorType() {
        return new NavegadorType();
    }

    /**
     * Create an instance of {@link HeaderResponseType }
     * 
     */
    public HeaderResponseType createHeaderResponseType() {
        return new HeaderResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.allshop.com/framework/core/ws/general/Headers", name = "HeaderReq")
    public JAXBElement<HeaderRequestType> createHeaderReq(HeaderRequestType value) {
        return new JAXBElement<HeaderRequestType>(_HeaderReq_QNAME, HeaderRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.allshop.com/framework/core/ws/general/Headers", name = "HeaderRes")
    public JAXBElement<HeaderResponseType> createHeaderRes(HeaderResponseType value) {
        return new JAXBElement<HeaderResponseType>(_HeaderRes_QNAME, HeaderResponseType.class, null, value);
    }

}
