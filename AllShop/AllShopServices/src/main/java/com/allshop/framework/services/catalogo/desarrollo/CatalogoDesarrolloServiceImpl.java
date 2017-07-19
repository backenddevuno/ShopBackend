package com.allshop.framework.services.catalogo.desarrollo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.business.catalogo.desarrollo.CatalogoDesarrolloBusiness;
import com.allshop.framework.persistence.catalogo.desarrollo.vo.CatalogoDesarrolloVo;

@Service
public class CatalogoDesarrolloServiceImpl implements CatalogoDesarrolloService{
	@Autowired
	protected CatalogoDesarrolloBusiness catalogoDesarrolloBusiness;

	@Override
	public CatalogoDesarrolloVo crearCatalogoDesarrolloService(CatalogoDesarrolloVo catalogoDesarrolloVo)
			throws Exception {
		CatalogoDesarrolloVo catalogoDesarrolloVoOut = null;
		try{
			catalogoDesarrolloVoOut = catalogoDesarrolloBusiness.crearCatalogoDesarrolloBusiness(catalogoDesarrolloVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoDesarrolloVoOut;
	}

	@Override
	public CatalogoDesarrolloVo modificarCatalogoDesarrolloService(CatalogoDesarrolloVo catalogoDesarrolloVo)
			throws Exception {
		CatalogoDesarrolloVo catalogoDesarrolloVoOut = null;
		try{
			catalogoDesarrolloVoOut = catalogoDesarrolloBusiness.modificarCatalogoDesarrolloBusiness(catalogoDesarrolloVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoDesarrolloVoOut;
	}

	@Override
	public List<CatalogoDesarrolloVo> consultarCatalogoDesarrolloService(String idDesarrollo) throws Exception {
		List<CatalogoDesarrolloVo> listaCatalogoDesarrolloVoOut = null;
		try{
			listaCatalogoDesarrolloVoOut = catalogoDesarrolloBusiness.consultarCatalogoDesarrolloBusiness(idDesarrollo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listaCatalogoDesarrolloVoOut;
	}
}
