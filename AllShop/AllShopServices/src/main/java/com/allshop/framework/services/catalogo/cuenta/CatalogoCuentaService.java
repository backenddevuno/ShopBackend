package com.allshop.framework.services.catalogo.cuenta;

import java.util.List;

import com.allshop.framework.persistence.catalogo.cuenta.vo.CatalogoCuentaVo;

public interface CatalogoCuentaService {
		CatalogoCuentaVo crearCatalogoCuentaService(CatalogoCuentaVo catalogoCuentaVo) throws Exception;
		CatalogoCuentaVo modificarCatalogoCuentaService(CatalogoCuentaVo catalogoCuentaVo) throws Exception;
		List<CatalogoCuentaVo> consultarCatalogoCuentaService(String idCuenta) throws Exception;
}
