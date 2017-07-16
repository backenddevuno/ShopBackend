package com.allshop.framework.business.catalogos.rol;

import java.util.List;

import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;

public interface CatalogoRolBusiness {
	CatalogoRolVo crearCatalogoRolBusiness(CatalogoRolVo catalogoRolVo) throws Exception;
	CatalogoRolVo modificarCatalogoRolBusiness(CatalogoRolVo catalogoRolVo) throws Exception;
	List<CatalogoRolVo> consultarCatalogoRolBusiness(String idRol) throws Exception;
}
