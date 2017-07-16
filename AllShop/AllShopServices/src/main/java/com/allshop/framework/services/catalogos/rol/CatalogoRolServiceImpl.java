package com.allshop.framework.services.catalogos.rol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.business.catalogos.rol.CatalogoRolBusiness;
import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;

@Service
public class CatalogoRolServiceImpl implements CatalogoRolService{

	@Autowired
	protected CatalogoRolBusiness catalogoRolBusiness;
	
	@Override
	public CatalogoRolVo crearCatalogoRolService(CatalogoRolVo catalogoRolVo) {
		return catalogoRolBusiness.crearCatalogoRolBusiness(catalogoRolVo);
	}

	@Override
	public CatalogoRolVo modificarCatalogoRolService(CatalogoRolVo catalogoRolVo) {
		return catalogoRolBusiness.modificarCatalogoRolBusiness(catalogoRolVo);
	}

	@Override
	public List<CatalogoRolVo> consultarCatalogoRolService(String idRol) {
		return catalogoRolBusiness.consultarCatalogoRolBusiness(idRol);
	}

}
