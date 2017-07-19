package com.allshop.framework.services.catalogo.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.business.catalogo.categoria.CatalogoCategoriaBusiness;
import com.allshop.framework.persistence.catalogo.categoria.vo.CatalogoCategoriaVo;

@Service
public class CatalogoCategoriaServiceImpl implements CatalogoCategoriaService{
	@Autowired
	protected CatalogoCategoriaBusiness catalogoCategoriaBusiness;

	@Override
	public CatalogoCategoriaVo crearCatalogoCategoriaService(CatalogoCategoriaVo catalogoCategoriaVo) throws Exception {
		CatalogoCategoriaVo catalogoCategoriaVoOut = null;
		try{
			catalogoCategoriaVoOut = catalogoCategoriaBusiness.crearCatalogoCategoriaBusiness(catalogoCategoriaVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoCategoriaVoOut;
	}

	@Override
	public CatalogoCategoriaVo modificarCatalogoCategoriaService(CatalogoCategoriaVo catalogoCategoriaVo)
			throws Exception {
		CatalogoCategoriaVo catalogoCategoriaVoOut = null;
		try{
			catalogoCategoriaVoOut = catalogoCategoriaBusiness.modificarCatalogoCategoriaBusiness(catalogoCategoriaVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoCategoriaVoOut;
	}

	@Override
	public List<CatalogoCategoriaVo> consultarCatalogoCategoriaService(String idCategoria) throws Exception {
		List<CatalogoCategoriaVo> listaCatalogoCategoriaVoOut = null;
		try{
			listaCatalogoCategoriaVoOut = catalogoCategoriaBusiness.consultarCatalogoCategoriaBusiness(idCategoria);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listaCatalogoCategoriaVoOut;
	}
}
