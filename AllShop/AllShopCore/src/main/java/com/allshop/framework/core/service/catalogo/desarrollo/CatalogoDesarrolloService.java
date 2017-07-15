package com.allshop.framework.core.service.catalogo.desarrollo;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoDesarrolloOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoDesarrolloInType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoDesarrolloOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoDesarrolloInType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoDesarrolloOutType;

public interface CatalogoDesarrolloService {
	CrearCatalogoDesarrolloOutType crearCatalogoDesarrollo(CrearCatalogoDesarrolloInType crearCatalogoDesarrolloInType);
	ModificarCatalogoDesarrolloOutType modificarCatalogoDesarrollo(ModificarCatalogoDesarrolloInType modificarCatalogoDesarrolloInType);
	ConsultarCatalogoDesarrolloOutType consultarCatalogoDesarrollo(String idDesarrollo);
}
