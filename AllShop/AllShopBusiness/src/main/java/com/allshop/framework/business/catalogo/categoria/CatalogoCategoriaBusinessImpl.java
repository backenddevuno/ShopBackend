package com.allshop.framework.business.catalogo.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.persistence.catalogo.categoria.dao.CatalogoCategoriaDao;
import com.allshop.framework.persistence.catalogo.categoria.vo.CatalogoCategoriaVo;

@Service
public class CatalogoCategoriaBusinessImpl implements CatalogoCategoriaBusiness{

	@Autowired
	protected CatalogoCategoriaDao catalogoCategoriaDao;
	
	@Override
	public CatalogoCategoriaVo crearCatalogoCategoriaBusiness(CatalogoCategoriaVo catalogoCategoriaVo)
			throws Exception {
		CatalogoCategoriaVo catalogoCategoriaVoOut = null;
		try{
			catalogoCategoriaVoOut = catalogoCategoriaDao.crearCatalogoCategoriaDao(catalogoCategoriaVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoCategoriaVoOut;
	}

	@Override
	public CatalogoCategoriaVo modificarCatalogoCategoriaBusiness(CatalogoCategoriaVo catalogoCategoriaVo)
			throws Exception {
		CatalogoCategoriaVo catalogoCategoriaVoOut = null;
		try{
			catalogoCategoriaVoOut = catalogoCategoriaDao.modificarCatalogoCategoriaDao(catalogoCategoriaVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoCategoriaVoOut;
	}

	@Override
	public List<CatalogoCategoriaVo> consultarCatalogoCategoriaBusiness(String idCategoria) throws Exception {
		List<CatalogoCategoriaVo> listCatalogoCategoriaVoOut = null;
		try{
			listCatalogoCategoriaVoOut = catalogoCategoriaDao.consultarCatalogoCategoriaDao(idCategoria);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listCatalogoCategoriaVoOut;
	}

}
