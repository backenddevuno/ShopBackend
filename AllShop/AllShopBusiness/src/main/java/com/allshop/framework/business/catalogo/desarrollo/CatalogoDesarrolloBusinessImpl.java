package com.allshop.framework.business.catalogo.desarrollo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.persistence.catalogo.desarrollo.dao.CatalogoDesarrolloDao;
import com.allshop.framework.persistence.catalogo.desarrollo.vo.CatalogoDesarrolloVo;

@Service
public class CatalogoDesarrolloBusinessImpl implements CatalogoDesarrolloBusiness{

	@Autowired
	protected CatalogoDesarrolloDao catalogoDesarrolloDao;

	@Override
	public CatalogoDesarrolloVo crearCatalogoDesarrolloBusiness(CatalogoDesarrolloVo catalogoDesarrolloVo)
			throws Exception {
		CatalogoDesarrolloVo catalogoDesarrolloVoOut = null;
		try{
			catalogoDesarrolloVoOut = catalogoDesarrolloDao.crearCatalogoDesarrolloDao(catalogoDesarrolloVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoDesarrolloVoOut;
	}

	@Override
	public CatalogoDesarrolloVo modificarCatalogoDesarrolloBusiness(CatalogoDesarrolloVo catalogoDesarrolloVo)
			throws Exception {
		CatalogoDesarrolloVo catalogoDesarrolloVoOut = null;
		try{
			catalogoDesarrolloVoOut = catalogoDesarrolloDao.modificarCatalogoDesarrolloDao(catalogoDesarrolloVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoDesarrolloVoOut;
	}

	@Override
	public List<CatalogoDesarrolloVo> consultarCatalogoDesarrolloBusiness(String idDesarrollo) throws Exception {
		List<CatalogoDesarrolloVo> listCatalogoDesarrolloVoOut = null;
		try{
			listCatalogoDesarrolloVoOut = catalogoDesarrolloDao.consultarCatalogoDesarrolloDao(idDesarrollo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listCatalogoDesarrolloVoOut;
	}

}
