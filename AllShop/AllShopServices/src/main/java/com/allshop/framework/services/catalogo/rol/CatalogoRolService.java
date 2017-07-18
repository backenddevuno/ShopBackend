package com.allshop.framework.services.catalogo.rol;

import java.util.List;

import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;

public interface CatalogoRolService {
	CatalogoRolVo crearCatalogoRolService(CatalogoRolVo catalogoRolVo) throws Exception;
	CatalogoRolVo modificarCatalogoRolService(CatalogoRolVo catalogoRolVo) throws Exception;
	List<CatalogoRolVo> consultarCatalogoRolService(String idRol) throws Exception;
}
