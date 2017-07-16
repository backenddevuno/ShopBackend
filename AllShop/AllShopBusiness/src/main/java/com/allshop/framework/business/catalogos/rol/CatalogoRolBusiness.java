package com.allshop.framework.business.catalogos.rol;

import java.util.List;

import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;

public interface CatalogoRolBusiness {
	CatalogoRolVo crearCatalogoRolBusiness(CatalogoRolVo catalogoRolVo);
	CatalogoRolVo modificarCatalogoRolBusiness(CatalogoRolVo catalogoRolVo);
	List<CatalogoRolVo> consultarCatalogoRolBusiness(String idRol);
}
