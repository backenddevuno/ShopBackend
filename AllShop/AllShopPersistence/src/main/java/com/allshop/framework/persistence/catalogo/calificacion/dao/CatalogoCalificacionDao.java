package com.allshop.framework.persistence.catalogo.calificacion.dao;

import java.util.List;

import com.allshop.framework.persistence.catalogo.calificacion.vo.CatalogoCalificacionVo;

public interface CatalogoCalificacionDao {
	CatalogoCalificacionVo crearCatalogoCalificacionDao(CatalogoCalificacionVo catalogoCalificacionVo) throws Exception;
	CatalogoCalificacionVo modificarCatalogoCalificacionDao(CatalogoCalificacionVo catalogoCalificacionVo) throws Exception;
	List<CatalogoCalificacionVo> consultarCatalogoCalificacionDao(String idCalificacion) throws Exception;
}
