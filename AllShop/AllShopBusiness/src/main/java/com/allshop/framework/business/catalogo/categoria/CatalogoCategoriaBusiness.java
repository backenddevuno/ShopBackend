package com.allshop.framework.business.catalogo.categoria;

import java.util.List;

import com.allshop.framework.persistence.catalogo.categoria.vo.CatalogoCategoriaVo;

public interface CatalogoCategoriaBusiness {
	CatalogoCategoriaVo crearCatalogoCategoriaBusiness(CatalogoCategoriaVo catalogoCategoriaVo) throws Exception;
	CatalogoCategoriaVo modificarCatalogoCategoriaBusiness(CatalogoCategoriaVo catalogoCategoriaVo) throws Exception;
	List<CatalogoCategoriaVo> consultarCatalogoCategoriaBusiness(String idCategoria) throws Exception;
}
