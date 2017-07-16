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
	public CatalogoRolVo crearCatalogoRolBusiness(CatalogoRolVo catalogoRolVoIn) throws Exception {
		CatalogoRolVo catalogoRolVoOut = null;
		try{
			catalogoRolVoOut = catalogoRolDao.crearCatalogoRolDao(catalogoRolVoIn);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoRolVoOut;
	}

	@Override
	public CatalogoRolVo modificarCatalogoRolBusiness(CatalogoRolVo catalogoRolVoIn) throws Exception {
		CatalogoRolVo catalogoRolVoOut = null;
		try{
			catalogoRolVoOut = catalogoRolDao.modificarCatalogoRolDao(catalogoRolVoIn);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoRolVoOut;
	}

	@Override
	public List<CatalogoRolVo> consultarCatalogoRolBusiness(String idRol) throws Exception {
		List<CatalogoRolVo> listCatalogoRolVoOut = null;
		try{
			listCatalogoRolVoOut = catalogoRolDao.consultarCatalogoRolDao(idRol);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listCatalogoRolVoOut;
	}

}
