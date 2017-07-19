package com.allshop.framework.services.catalogo.cuenta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.business.catalogo.cuenta.CatalogoCuentaBusiness;
import com.allshop.framework.persistence.catalogo.cuenta.vo.CatalogoCuentaVo;

@Service
public class CatalogoCuentaServiceImpl implements CatalogoCuentaService{
	@Autowired
	protected CatalogoCuentaBusiness catalogoCuentaBusiness;

	@Override
	public CatalogoCuentaVo crearCatalogoCuentaService(CatalogoCuentaVo catalogoCuentaVo) throws Exception {
		CatalogoCuentaVo catalogoCuentaVoOut = null;
		try{
			catalogoCuentaVoOut = catalogoCuentaBusiness.crearCatalogoCuentaBusiness(catalogoCuentaVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoCuentaVoOut;
	}

	@Override
	public CatalogoCuentaVo modificarCatalogoCuentaService(CatalogoCuentaVo catalogoCuentaVo) throws Exception {
		CatalogoCuentaVo catalogoCuentaVoOut = null;
		try{
			catalogoCuentaVoOut = catalogoCuentaBusiness.modificarCatalogoCuentaBusiness(catalogoCuentaVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoCuentaVoOut;
	}

	@Override
	public List<CatalogoCuentaVo> consultarCatalogoCuentaService(String idCuenta) throws Exception {
		List<CatalogoCuentaVo> listaCatalogoCuentaVoOut = null;
		try{
			listaCatalogoCuentaVoOut = catalogoCuentaBusiness.consultarCatalogoCuentaBusiness(idCuenta);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listaCatalogoCuentaVoOut;
	}
}
