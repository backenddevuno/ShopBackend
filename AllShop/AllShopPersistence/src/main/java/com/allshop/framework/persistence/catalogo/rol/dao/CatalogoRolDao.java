package com.allshop.framework.persistence.catalogo.rol.dao;

import java.util.List;

import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;
import com.allshop.framework.persistence.common.EstatusComunVo;

public interface CatalogoRolDao {
	EstatusComunVo crearCatalogoRolDao(CatalogoRolVo catalogoRolVo);
	EstatusComunVo modificarCatalogoRolDao(CatalogoRolVo catalogoRolVo);
	List<CatalogoRolVo> consultarCatalogoRolDao(String idRol);
}
