package com.allshop.framework.business.catalogo.cuenta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.persistence.catalogo.cuenta.dao.CatalogoCuentaDao;
import com.allshop.framework.persistence.catalogo.cuenta.vo.CatalogoCuentaVo;

@Service
public class CatalogoCuentaBusinessImpl implements CatalogoCuentaBusiness{

	@Autowired
	protected CatalogoCuentaDao catalogoCuentaDao;

	@Override
	public CatalogoCuentaVo crearCatalogoCuentaBusiness(CatalogoCuentaVo catalogoCuentaVo) throws Exception {
		CatalogoCuentaVo catalogoCuentaVoOut = null;
		try{
			catalogoCuentaVoOut = catalogoCuentaDao.crearCatalogoCuentaDao(catalogoCuentaVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoCuentaVoOut;
	}

	@Override
	public CatalogoCuentaVo modificarCatalogoCuentaBusiness(CatalogoCuentaVo catalogoCuentaVo) throws Exception {
		CatalogoCuentaVo catalogoCuentaVoOut = null;
		try{
			catalogoCuentaVoOut = catalogoCuentaDao.modificarCatalogoCuentaDao(catalogoCuentaVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoCuentaVoOut;
	}

	@Override
	public List<CatalogoCuentaVo> consultarCatalogoCuentaBusiness(String idCuenta) throws Exception {
		List<CatalogoCuentaVo> listCatalogoCuentaVoOut = null;
		try{
			listCatalogoCuentaVoOut = catalogoCuentaDao.consultarCatalogoCuentaDao(idCuenta);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listCatalogoCuentaVoOut;
	}

}
