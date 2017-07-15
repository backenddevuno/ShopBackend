package com.allshop.framework.core.service.catalogo.rol;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoRolOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoRolInType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoRolOutType;

public interface CatalogoRolComponent {
	CrearCatalogoRolOut crearCatalogoRolComponent(CrearCatalogoRolIn crearCatalogoRolInType);
	ModificarCatalogoRolOutType modificarCatalogoRolComponent(ModificarCatalogoRolInType modificarCatalogoRolInType);
	ConsultarCatalogoRolOutType consultarCatalogoRolComponent(String idRol);
}
