package com.allshop.framework.persistence.catalogo.rol.dao;

import java.util.List;

import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;

public interface CatalogoRolDao {
	CatalogoRolVo crearCatalogoRolDao(CatalogoRolVo catalogoRolVo) throws Exception;
	CatalogoRolVo modificarCatalogoRolDao(CatalogoRolVo catalogoRolVo) throws Exception;
	List<CatalogoRolVo> consultarCatalogoRolDao(String idRol) throws Exception;
}
