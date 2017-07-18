package com.allshop.framework.persistence.catalogo.desarrollo.dao;

import java.util.List;

import com.allshop.framework.persistence.catalogo.desarrollo.vo.CatalogoDesarrolloVo;

public interface CatalogoDesarrolloDao {
	CatalogoDesarrolloVo crearCatalogoDesarrolloDao(CatalogoDesarrolloVo catalogoDesarrolloVo) throws Exception;
	CatalogoDesarrolloVo modificarCatalogoDesarrolloDao(CatalogoDesarrolloVo catalogoDesarrolloVo) throws Exception;
	List<CatalogoDesarrolloVo> consultarCatalogoDesarrolloDao(String idDesarrollo) throws Exception;
}
