package com.allshop.framework.business.catalogo.lenguaje;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.persistence.catalogo.lenguaje.dao.CatalogoLenguajeDao;
import com.allshop.framework.persistence.catalogo.lenguaje.vo.CatalogoLenguajeVo;

@Service
public class CatalogoLenguajeBusinessImpl implements CatalogoLenguajeBusiness{

	@Autowired
	protected CatalogoLenguajeDao catalogoLenguajeDao;
	
	@Override
	public CatalogoLenguajeVo crearCatalogoLenguajeBusiness(CatalogoLenguajeVo catalogoLenguajeVo) throws Exception {
		CatalogoLenguajeVo catalogoLenguajeVoOut = null;
		try{
			catalogoLenguajeVoOut = catalogoLenguajeDao.crearCatalogoLenguajeDao(catalogoLenguajeVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoLenguajeVoOut;
	}

	@Override
	public CatalogoLenguajeVo modificarCatalogoLenguajeBusiness(CatalogoLenguajeVo catalogoLenguajeVo)
			throws Exception {
		CatalogoLenguajeVo catalogoLenguajeVoOut = null;
		try{
			catalogoLenguajeVoOut = catalogoLenguajeDao.modificarCatalogoLenguajeDao(catalogoLenguajeVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoLenguajeVoOut;
	}

	@Override
	public List<CatalogoLenguajeVo> consultarCatalogoLenguajeBusiness(String idLenguaje) throws Exception {
		List<CatalogoLenguajeVo> listCatalogoLenguajeVoOut = null;
		try{
			listCatalogoLenguajeVoOut = catalogoLenguajeDao.consultarCatalogoLenguajeDao(idLenguaje);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listCatalogoLenguajeVoOut;
	}

}
