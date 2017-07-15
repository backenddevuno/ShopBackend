package com.allshop.framework.web.endpoint.catalogos.rol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.allshop.framework.core.exception.CodigosError;
import com.allshop.framework.core.exception.ServiceFaultException;
import com.allshop.framework.core.service.catalogo.rol.CatalogoRolComponent;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolOut;
import com.allshop.framework.core.ws.common.excepciongeneral.ExcepcionGenericaType;

@Endpoint
public class CatalogoCorporativoEndpoint {
private static final String TARGET_NAMESPACE = "http://www.allshop.com/framework/core/ws/CatalogosCorporativos";
	
	@Autowired
	private CatalogoRolComponent catalogoRolComponent;
	
	@PayloadRoot(localPart = "CrearCatalogoRolIn", namespace = TARGET_NAMESPACE)
	@ResponsePayload  public CrearCatalogoRolOut getSeguridadLoginOut(@RequestPayload CrearCatalogoRolIn request, MessageContext messageContext){
		CrearCatalogoRolOut response = new CrearCatalogoRolOut();	
		try {
			response = catalogoRolComponent.crearCatalogoRolComponent(request);
		} catch(Exception ex){
		    throw new ServiceFaultException(CodigosError.ERROR.toString(),ex, new ExcepcionGenericaType());
		}
	    
		return response;
	}

	public void setCatalogoRolComponent(CatalogoRolComponent catalogoRolComponent) {
		this.catalogoRolComponent = catalogoRolComponent;
	}
}
