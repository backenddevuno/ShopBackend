package com.allshop.framework.services.catalogos.rol;

import java.util.List;

import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;
import com.allshop.framework.persistence.common.EstatusComunVo;

public interface CatalogoRolService {
	EstatusComunVo crearCatalogoRolService(CatalogoRolVo catalogoRolVo);
	EstatusComunVo modificarCatalogoRolService(CatalogoRolVo catalogoRolVo);
	List<CatalogoRolVo> consultarCatalogoRolService(String idRol);
}
