package com.allshop.framework.business.catalogo.moneda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.persistence.catalogo.moneda.dao.CatalogoMonedaDao;
import com.allshop.framework.persistence.catalogo.moneda.vo.CatalogoMonedaVo;

@Service
public class CatalogoMonedaBusinessImpl implements CatalogoMonedaBusiness{

	@Autowired
	protected CatalogoMonedaDao catalogoMonedaDao;
	
	@Override
	public CatalogoMonedaVo crearCatalogoMonedaBusiness(CatalogoMonedaVo catalogoMonedaVo) throws Exception {
		CatalogoMonedaVo catalogoMonedaVoOut = null;
		try{
			catalogoMonedaVoOut = catalogoMonedaDao.crearCatalogoMonedaDao(catalogoMonedaVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoMonedaVoOut;
	}

	@Override
	public CatalogoMonedaVo modificarCatalogoMonedaBusiness(CatalogoMonedaVo catalogoMonedaVo) throws Exception {
		CatalogoMonedaVo catalogoMonedaVoOut = null;
		try{
			catalogoMonedaVoOut = catalogoMonedaDao.modificarCatalogoMonedaDao(catalogoMonedaVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoMonedaVoOut;
	}

	@Override
	public List<CatalogoMonedaVo> consultarCatalogoMonedaBusiness(String idMoneda) throws Exception {
		List<CatalogoMonedaVo> listCatalogoMonedaVoOut = null;
		try{
			listCatalogoMonedaVoOut = catalogoMonedaDao.consultarCatalogoMonedaDao(idMoneda);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listCatalogoMonedaVoOut;
	}

}
