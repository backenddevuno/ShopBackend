package com.allshop.framework.core.service.catalogo.desarrollo;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoDesarrolloOut;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoDesarrolloIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoDesarrolloOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoDesarrolloIn;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoDesarrolloOut;

public interface CatalogoDesarrolloService {
	CrearCatalogoDesarrolloOut crearCatalogoDesarrollo(CrearCatalogoDesarrolloIn crearCatalogoDesarrolloIn);
	ModificarCatalogoDesarrolloOut modificarCatalogoDesarrollo(ModificarCatalogoDesarrolloIn modificarCatalogoDesarrolloIn);
	ConsultarCatalogoDesarrolloOut consultarCatalogoDesarrollo(String idDesarrollo);
}
