package com.allshop.framework.core.service.catalogo.calificacion;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoCalificacionOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoCalificacionInType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoCalificacionOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoCalificacionInType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoCalificacionOutType;

public interface CatalogoCalificacionService {
	CrearCatalogoCalificacionOutType crearCatalogoCalificacion(CrearCatalogoCalificacionInType crearCatalogoCalificacionInType);
	ModificarCatalogoCalificacionOutType modificarCatalogoCalificacion(ModificarCatalogoCalificacionInType modificarCatalogoCalificacionInType);
	ConsultarCatalogoCalificacionOutType consultarCatalogoCalificacion(String idCalificacion);
}
