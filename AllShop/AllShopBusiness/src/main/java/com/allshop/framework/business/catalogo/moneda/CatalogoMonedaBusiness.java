package com.allshop.framework.business.catalogo.moneda;

import java.util.List;

import com.allshop.framework.persistence.catalogo.moneda.vo.CatalogoMonedaVo;

public interface CatalogoMonedaBusiness {
	CatalogoMonedaVo crearCatalogoMonedaBusiness(CatalogoMonedaVo catalogoMonedaVo) throws Exception;
	CatalogoMonedaVo modificarCatalogoMonedaBusiness(CatalogoMonedaVo catalogoMonedaVo) throws Exception;
	List<CatalogoMonedaVo> consultarCatalogoMonedaBusiness(String idMoneda) throws Exception;
}
