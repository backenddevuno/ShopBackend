package com.allshop.framework.services.catalogo.desarrollo;

import java.util.List;

import com.allshop.framework.persistence.catalogo.desarrollo.vo.CatalogoDesarrolloVo;

public interface CatalogoDesarrolloService {
	CatalogoDesarrolloVo crearCatalogoDesarrolloService (CatalogoDesarrolloVo catalogoDesarrolloVo) throws Exception;
	CatalogoDesarrolloVo modificarCatalogoDesarrolloService (CatalogoDesarrolloVo catalogoDesarrolloVo) throws Exception;
	List<CatalogoDesarrolloVo> consultarCatalogoDesarrolloService (String idDesarrollo) throws Exception;
}
