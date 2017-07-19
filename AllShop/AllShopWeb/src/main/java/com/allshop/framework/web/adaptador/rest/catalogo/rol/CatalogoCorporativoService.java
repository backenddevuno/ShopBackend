package com.allshop.framework.web.adaptador.rest.catalogo.rol;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.allshop.framework.core.service.catalogo.rol.CatalogoRolComponent;
import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoRolOut;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoRolIn;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoRolOut;

@Path("/CatalogoCorporativo")
public class CatalogoCorporativoService {

	@Autowired
	private CatalogoRolComponent catalogoRolComponent;
	
	@GET
	@Path("/{idRol}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ConsultarCatalogoRolOut getEmployee(@PathParam("idRol") String idRol) {
		ConsultarCatalogoRolOut consultarCatalogoRolOut = null;
		try{
			consultarCatalogoRolOut = catalogoRolComponent.consultarCatalogoRolComponent(idRol);
		} catch(Exception ex){
			ex.printStackTrace();
//		    throw new ServiceFaultException(CodigosError.ERROR.toString(), ex, messageContext);
		}
		return consultarCatalogoRolOut;
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public CrearCatalogoRolOut addEmployee(CrearCatalogoRolIn crearCatalogoRolIn) {
		CrearCatalogoRolOut crearCatalogoRolOut = null;
		try{
			crearCatalogoRolOut = catalogoRolComponent.crearCatalogoRolComponent(crearCatalogoRolIn);
		} catch(Exception ex){
			ex.printStackTrace();
//		    throw new ServiceFaultException(CodigosError.ERROR.toString(), ex, messageContext);
		}
		return crearCatalogoRolOut;
	}

	@PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ModificarCatalogoRolOut updateEmployee(ModificarCatalogoRolIn modificarCatalogoRolIn) {
		ModificarCatalogoRolOut modificarCatalogoRolOut = null;
		try{
			modificarCatalogoRolOut = catalogoRolComponent.modificarCatalogoRolComponent(modificarCatalogoRolIn);
		} catch(Exception ex){
			ex.printStackTrace();
//		    throw new ServiceFaultException(CodigosError.ERROR.toString(), ex, messageContext);
		}
		return modificarCatalogoRolOut;
	}

	public void setCatalogoRolComponent(CatalogoRolComponent catalogoRolComponent) {
		this.catalogoRolComponent = catalogoRolComponent;
	}
	
}
