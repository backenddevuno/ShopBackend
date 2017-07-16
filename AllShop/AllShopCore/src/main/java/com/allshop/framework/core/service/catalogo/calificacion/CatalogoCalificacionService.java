package com.allshop.framework.core.service.catalogo.calificacion;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoCalificacionOut;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoCalificacionIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoCalificacionOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoCalificacionIn;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoCalificacionOut;

public interface CatalogoCalificacionService {
	CrearCatalogoCalificacionOut crearCatalogoCalificacion(CrearCatalogoCalificacionIn crearCatalogoCalificacionIn);
	ModificarCatalogoCalificacionOut modificarCatalogoCalificacion(ModificarCatalogoCalificacionIn modificarCatalogoCalificacionIn);
	ConsultarCatalogoCalificacionOut consultarCatalogoCalificacion(String idCalificacion);
}
