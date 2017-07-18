package com.allshop.framework.persistence.catalogo.moneda.dao;

import java.util.List;

import com.allshop.framework.persistence.catalogo.moneda.vo.CatalogoMonedaVo;

public interface CatalogoMonedaDao {
	CatalogoMonedaVo crearCatalogoMonedaDao(CatalogoMonedaVo catalogoMonedaVo) throws Exception;
	CatalogoMonedaVo modificarCatalogoMonedaDao(CatalogoMonedaVo catalogoMonedaVo) throws Exception;
	List<CatalogoMonedaVo> consultarCatalogoMonedaDao(String idMoneda) throws Exception;
}
