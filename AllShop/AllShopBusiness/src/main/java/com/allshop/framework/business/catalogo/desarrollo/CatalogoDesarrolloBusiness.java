package com.allshop.framework.business.catalogo.desarrollo;

import java.util.List;

import com.allshop.framework.persistence.catalogo.desarrollo.vo.CatalogoDesarrolloVo;

public interface CatalogoDesarrolloBusiness {
	CatalogoDesarrolloVo crearCatalogoDesarrolloBusiness (CatalogoDesarrolloVo catalogoDesarrolloVo) throws Exception;
	CatalogoDesarrolloVo modificarCatalogoDesarrolloBusiness (CatalogoDesarrolloVo catalogoDesarrolloVo) throws Exception;
	List<CatalogoDesarrolloVo> consultarCatalogoDesarrolloBusiness (String idDesarrollo) throws Exception;
}
