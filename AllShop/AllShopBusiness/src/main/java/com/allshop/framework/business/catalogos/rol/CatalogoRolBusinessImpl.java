package com.allshop.framework.business.catalogos.rol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.persistence.catalogo.rol.dao.CatalogoRolDao;
import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;

@Service
public class CatalogoRolBusinessImpl implements CatalogoRolBusiness{

	@Autowired
	protected CatalogoRolDao catalogoRolDao;
	
	@Override
	public CatalogoRolVo crearCatalogoRolBusiness(CatalogoRolVo catalogoRolVo) {
		return catalogoRolDao.crearCatalogoRolDao(catalogoRolVo);
	}

	@Override
	public CatalogoRolVo modificarCatalogoRolBusiness(CatalogoRolVo catalogoRolVo) {
		return catalogoRolDao.modificarCatalogoRolDao(catalogoRolVo);
	}

	@Override
	public List<CatalogoRolVo> consultarCatalogoRolBusiness(String idRol) {
		return catalogoRolDao.consultarCatalogoRolDao(idRol);
	}

}
