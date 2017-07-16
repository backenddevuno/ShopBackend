package com.allshop.framework.services.catalogos.rol;

import java.util.List;

import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;

public interface CatalogoRolService {
	CatalogoRolVo crearCatalogoRolService(CatalogoRolVo catalogoRolVo);
	CatalogoRolVo modificarCatalogoRolService(CatalogoRolVo catalogoRolVo);
	List<CatalogoRolVo> consultarCatalogoRolService(String idRol);
}
