package com.allshop.framework.persistence.catalogo.cuenta.dao;

import java.util.List;

import com.allshop.framework.persistence.catalogo.cuenta.vo.CatalogoCuentaVo;

public interface CatalogoCuentaDao {
	CatalogoCuentaVo crearCatalogoCuentaDao(CatalogoCuentaVo catalogoCuentaVo) throws Exception;
	CatalogoCuentaVo modificarCatalogoCuentaDao(CatalogoCuentaVo catalogoCuentaVo) throws Exception;
	List<CatalogoCuentaVo> consultarCatalogoCuentaDao(String idCuenta) throws Exception;
}
