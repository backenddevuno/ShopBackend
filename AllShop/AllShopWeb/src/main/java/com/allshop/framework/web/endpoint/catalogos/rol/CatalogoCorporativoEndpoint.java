package com.allshop.framework.web.endpoint.catalogos.rol;

import java.util.Date;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.allshop.framework.commons.utils.date.DateUtilsCommons;
import com.allshop.framework.core.common.SoapCommonElement;
import com.allshop.framework.core.exception.CodigosError;
import com.allshop.framework.core.exception.ServiceFaultException;
import com.allshop.framework.core.service.catalogo.rol.CatalogoRolComponent;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolOut;
import com.allshop.framework.core.ws.common.excepciongeneral.ExcepcionGenericaType;
import com.allshop.framework.core.ws.general.headers.EstadoRespuestaType;
import com.allshop.framework.persistence.common.EstadoRespuestaVo;
import com.allshop.framework.persistence.common.HeaderResponseVo;

@Endpoint
public class CatalogoCorporativoEndpoint {
private static final String TARGET_NAMESPACE = "http://www.allshop.com/framework/core/ws/CatalogosCorporativos";
	
	@Autowired
	private CatalogoRolComponent catalogoRolComponent;
	
	@PayloadRoot(localPart = "CrearCatalogoRolIn", namespace = TARGET_NAMESPACE)
	@ResponsePayload  public CrearCatalogoRolOut getCrearCatalogoRolOut(@RequestPayload CrearCatalogoRolIn request, MessageContext messageContext) throws SOAPException, JAXBException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException{
		CrearCatalogoRolOut response = new CrearCatalogoRolOut();	

		try {
			response = catalogoRolComponent.crearCatalogoRolComponent(request);
			SoapCommonElement.addHeaderResponse(messageContext, getDefaultHeaderResponseVo(CrearCatalogoRolOut.class, CatalogoCorporativoEndpoint.class));
		} catch(Exception ex){
			ex.printStackTrace();
		    throw new ServiceFaultException(CodigosError.ERROR.toString(), ex, messageContext);
		}
	    
		return response;
	}

	public void setCatalogoRolComponent(CatalogoRolComponent catalogoRolComponent) {
		this.catalogoRolComponent = catalogoRolComponent;
	}
	
	public HeaderResponseVo getDefaultHeaderResponseVo(Class<CrearCatalogoRolOut> classCrearCatalogoRolOut, Class<CatalogoCorporativoEndpoint> classCatalogoCorporativoEndpoint){
		HeaderResponseVo headerResponseVo = new HeaderResponseVo();
        EstadoRespuestaVo estadoRespuestaVo = new EstadoRespuestaVo();
        estadoRespuestaVo.setId("1");
        estadoRespuestaVo.setMensajeAUsuario("SUCCESS");
        estadoRespuestaVo.setMensajeDetallado("El registro de actualizo correctamente.");
        estadoRespuestaVo.setNivelSegRequerido(1);
        headerResponseVo.setEstadoRespuesta(estadoRespuestaVo);
        headerResponseVo.setIdOperacion(classCrearCatalogoRolOut.getName());
        headerResponseVo.setNumReferencia(classCatalogoCorporativoEndpoint.getName());
        headerResponseVo.setTokenOperacion(String.valueOf(classCatalogoCorporativoEndpoint.hashCode()));
        headerResponseVo.setFechaHora(new Date());
        headerResponseVo.setTotalOcurrencias(classCatalogoCorporativoEndpoint.hashCode());
		return headerResponseVo;
	}
}
