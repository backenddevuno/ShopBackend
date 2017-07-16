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
	public CatalogoRolVo crearCatalogoRolService(CatalogoRolVo catalogoRolVoIn) throws Exception {
		CatalogoRolVo catalogoRolVoOut = null;
		try{
			catalogoRolVoOut = catalogoRolBusiness.crearCatalogoRolBusiness(catalogoRolVoIn);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoRolVoOut;
	}

	@Override
	public CatalogoRolVo modificarCatalogoRolService(CatalogoRolVo catalogoRolVoIn) throws Exception {
		CatalogoRolVo catalogoRolVoOut = null;
		try{
			catalogoRolVoOut = catalogoRolBusiness.modificarCatalogoRolBusiness(catalogoRolVoIn);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoRolVoOut;
	}

	@Override
	public List<CatalogoRolVo> consultarCatalogoRolService(String idRol) throws Exception {
		List<CatalogoRolVo> listCatalogoRolVoOut = null;
		try{
			listCatalogoRolVoOut = catalogoRolBusiness.consultarCatalogoRolBusiness(idRol);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listCatalogoRolVoOut;
	}

}
