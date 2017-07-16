package com.allshop.framework.core.service.catalogo.rol;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoRolOut;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoRolIn;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoRolOut;

public interface CatalogoRolComponent {
	CrearCatalogoRolOut crearCatalogoRolComponent(CrearCatalogoRolIn crearCatalogoRolIn) throws Exception;
	ModificarCatalogoRolOut modificarCatalogoRolComponent(ModificarCatalogoRolIn modificarCatalogoRolIn) throws Exception;
	ConsultarCatalogoRolOut consultarCatalogoRolComponent(String idRol) throws Exception;
}
