package com.allshop.framework.services.catalogo.categoria;

import java.util.List;

import com.allshop.framework.persistence.catalogo.categoria.vo.CatalogoCategoriaVo;

public interface CatalogoCategoriaService {
	CatalogoCategoriaVo crearCatalogoCategoriaService(CatalogoCategoriaVo catalogoCategoriaVo) throws Exception;
	CatalogoCategoriaVo modificarCatalogoCategoriaService(CatalogoCategoriaVo catalogoCategoriaVo) throws Exception;
	List<CatalogoCategoriaVo> consultarCatalogoCategoriaService(String idCategoria) throws Exception;
}
