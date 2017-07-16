package com.allshop.framework.core.exception;

import java.util.Date;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.springframework.ws.context.MessageContext;

import com.allshop.framework.core.common.SoapCommonElement;
import com.allshop.framework.core.ws.common.excepciongeneral.ExcepcionGenericaType;
import com.allshop.framework.persistence.common.EstadoRespuestaVo;
import com.allshop.framework.persistence.common.HeaderResponseVo;

public class ServiceFaultException extends RuntimeException {

	private static final long serialVersionUID = 7885514313311177523L;
	
	private ExcepcionGenericaType excepcionGenericaType;
	
    public ServiceFaultException(String message) {
        super(message);
    }
    
    public ServiceFaultException(Throwable e) {
        super(e);
    }
    
    public ServiceFaultException(String message, Throwable e) {
        super(message, e);
    }
    
    public ServiceFaultException(String message, ExcepcionGenericaType excepcionGenericaType) {
        super(message);
        this.excepcionGenericaType = excepcionGenericaType;
    }
    
    public ServiceFaultException(String message, Throwable e, ExcepcionGenericaType excepcionGenericaType) {
        super(message, e);
        this.excepcionGenericaType = excepcionGenericaType;
    }
    
    public ServiceFaultException(String message, Throwable e, MessageContext messageContext) throws SOAPException, JAXBException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {
        super(message, e);
        HeaderResponseVo headerResponseVo = new HeaderResponseVo();
        EstadoRespuestaVo estadoRespuestaVo = new EstadoRespuestaVo();
        estadoRespuestaVo.setId(String.valueOf(e.hashCode()));
        estadoRespuestaVo.setMensajeAUsuario(message);
        estadoRespuestaVo.setMensajeDetallado(e.getMessage());
        estadoRespuestaVo.setNivelSegRequerido(e.hashCode());
        headerResponseVo.setEstadoRespuesta(estadoRespuestaVo);
        
        headerResponseVo.setIdOperacion(e.getStackTrace()[0].getMethodName());
        headerResponseVo.setNumReferencia(e.getStackTrace()[0].getClassName());
        headerResponseVo.setFechaHora(new Date());
        headerResponseVo.setTokenOperacion(String.valueOf(e.hashCode()));
        headerResponseVo.setTokenOperacion(String.valueOf(e.hashCode()));
        
        SoapCommonElement.addHeaderResponse(messageContext, headerResponseVo);
    }

    public ExcepcionGenericaType getExcepcionGenericaType() {
        return excepcionGenericaType;
    }

    public void setExcepcionGenericaType(ExcepcionGenericaType excepcionGenericaType) {
        this.excepcionGenericaType = excepcionGenericaType;
    }

}
