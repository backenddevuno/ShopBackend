package com.allshop.framework.services.catalogo.lenguaje;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.business.catalogo.lenguaje.CatalogoLenguajeBusiness;
import com.allshop.framework.persistence.catalogo.lenguaje.vo.CatalogoLenguajeVo;

@Service
public class CatalogoLenguajeServiceImpl implements CatalogoLenguajeService{
	@Autowired
	protected CatalogoLenguajeBusiness catalogoLenguajeBusiness;

	@Override
	public CatalogoLenguajeVo crearCatalogoLenguajeService(CatalogoLenguajeVo catalogoLenguajeVo) throws Exception {
		CatalogoLenguajeVo catalogoLenguajeVoOut = null;
		try{
			catalogoLenguajeVoOut = catalogoLenguajeBusiness.crearCatalogoLenguajeBusiness(catalogoLenguajeVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoLenguajeVoOut;
	}

	@Override
	public CatalogoLenguajeVo modificarCatalogoLenguajeService(CatalogoLenguajeVo catalogoLenguajeVo) throws Exception {
		CatalogoLenguajeVo catalogoLenguajeVoOut = null;
		try{
			catalogoLenguajeVoOut = catalogoLenguajeBusiness.modificarCatalogoLenguajeBusiness(catalogoLenguajeVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoLenguajeVoOut;
	}

	@Override
	public List<CatalogoLenguajeVo> consultarCatalogoLenguajeService(String idLenguaje) throws Exception {
		List<CatalogoLenguajeVo> listaCatalogoLenguajeVoOut = null;
		try{
			listaCatalogoLenguajeVoOut = catalogoLenguajeBusiness.consultarCatalogoLenguajeBusiness(idLenguaje);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listaCatalogoLenguajeVoOut;
	}
}
