package com.allshop.framework.persistence.catalogo.rol.dao;

import java.util.List;

import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;

public interface CatalogoRolDao {
	CatalogoRolVo crearCatalogoRolDao(CatalogoRolVo catalogoRolVo);
	CatalogoRolVo modificarCatalogoRolDao(CatalogoRolVo catalogoRolVo);
	List<CatalogoRolVo> consultarCatalogoRolDao(String idRol);
}
