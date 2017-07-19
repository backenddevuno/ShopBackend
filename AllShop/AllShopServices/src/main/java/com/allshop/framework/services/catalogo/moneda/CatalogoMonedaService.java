package com.allshop.framework.services.catalogo.moneda;

import java.util.List;

import com.allshop.framework.persistence.catalogo.moneda.vo.CatalogoMonedaVo;

public interface CatalogoMonedaService {
	CatalogoMonedaVo crearCatalogoMonedaService(CatalogoMonedaVo catalogoMonedaVo) throws Exception;
	CatalogoMonedaVo modificarCatalogoMonedaService(CatalogoMonedaVo catalogoMonedaVo) throws Exception;
	List<CatalogoMonedaVo> consultarCatalogoMonedaService(String idMoneda) throws Exception;
}
