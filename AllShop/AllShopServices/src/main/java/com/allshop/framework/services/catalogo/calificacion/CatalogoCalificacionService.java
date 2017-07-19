package com.allshop.framework.services.catalogo.calificacion;

import java.util.List;

import com.allshop.framework.persistence.catalogo.calificacion.vo.CatalogoCalificacionVo;

public interface CatalogoCalificacionService {
	CatalogoCalificacionVo crearCatalogoCalificacionService(CatalogoCalificacionVo catalogoCalificacionVo) throws Exception;
	CatalogoCalificacionVo modificarCatalogoCalificacionService(CatalogoCalificacionVo catalogoCalificacionVo) throws Exception;
	List<CatalogoCalificacionVo> consultarCatalogoCalificacionService(String idCalificacion) throws Exception;
}
