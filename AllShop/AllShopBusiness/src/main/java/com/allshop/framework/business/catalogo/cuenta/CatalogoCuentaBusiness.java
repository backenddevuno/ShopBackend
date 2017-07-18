package com.allshop.framework.business.catalogo.cuenta;

import java.util.List;

import com.allshop.framework.persistence.catalogo.cuenta.vo.CatalogoCuentaVo;

public interface CatalogoCuentaBusiness {
	CatalogoCuentaVo crearCatalogoCuentaBusiness(CatalogoCuentaVo catalogoCuentaVo) throws Exception;
	CatalogoCuentaVo modificarCatalogoCuentaBusiness(CatalogoCuentaVo catalogoCuentaVo) throws Exception;
	List<CatalogoCuentaVo> consultarCatalogoCuentaBusiness(String idCuenta) throws Exception;
}
