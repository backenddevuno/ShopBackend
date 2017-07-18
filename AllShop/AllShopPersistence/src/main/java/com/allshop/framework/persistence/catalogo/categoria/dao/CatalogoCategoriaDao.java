package com.allshop.framework.persistence.catalogo.categoria.dao;

import java.util.List;

import com.allshop.framework.persistence.catalogo.categoria.vo.CatalogoCategoriaVo;

public interface CatalogoCategoriaDao {
	CatalogoCategoriaVo crearCatalogoCategoriaDao(CatalogoCategoriaVo catalogoCategoriaVo) throws Exception;
	CatalogoCategoriaVo modificarCatalogoCategoriaDao(CatalogoCategoriaVo catalogoCategoriaVo) throws Exception;
	List<CatalogoCategoriaVo> consultarCatalogoCategoriaDao(String idCategoria) throws Exception;
}
