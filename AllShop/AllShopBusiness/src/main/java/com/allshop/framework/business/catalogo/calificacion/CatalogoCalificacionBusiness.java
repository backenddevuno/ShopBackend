package com.allshop.framework.business.catalogo.calificacion;

import java.util.List;

import com.allshop.framework.persistence.catalogo.calificacion.vo.CatalogoCalificacionVo;

public interface CatalogoCalificacionBusiness {
	CatalogoCalificacionVo crearCatalogoCalificacionBusiness(CatalogoCalificacionVo catalogoCalificacionVo) throws Exception;
	CatalogoCalificacionVo modificarCatalogoCalificacionBusiness(CatalogoCalificacionVo catalogoCalificacionVo) throws Exception;
	List<CatalogoCalificacionVo> consultarCatalogoCalificacionBusiness(String idCalificacion) throws Exception;
}
