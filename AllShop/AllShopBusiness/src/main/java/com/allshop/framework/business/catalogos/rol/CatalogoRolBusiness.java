package com.allshop.framework.business.catalogos.rol;

import java.util.List;

import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;
import com.allshop.framework.persistence.common.EstatusComunVo;

public interface CatalogoRolBusiness {
	EstatusComunVo crearCatalogoRolBusiness(CatalogoRolVo catalogoRolVo);
	EstatusComunVo modificarCatalogoRolBusiness(CatalogoRolVo catalogoRolVo);
	List<CatalogoRolVo> consultarCatalogoRolBusiness(String idRol);
}
