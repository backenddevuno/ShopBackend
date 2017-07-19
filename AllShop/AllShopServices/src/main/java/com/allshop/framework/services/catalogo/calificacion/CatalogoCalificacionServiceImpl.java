package com.allshop.framework.services.catalogo.calificacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.business.catalogo.calificacion.CatalogoCalificacionBusiness;
import com.allshop.framework.persistence.catalogo.calificacion.vo.CatalogoCalificacionVo;

@Service
public class CatalogoCalificacionServiceImpl implements CatalogoCalificacionService{
	
	@Autowired
	protected CatalogoCalificacionBusiness catalogoCalificacionBusiness;

	@Override
	public CatalogoCalificacionVo crearCatalogoCalificacionService(CatalogoCalificacionVo catalogoCalificacionVo)
			throws Exception {
		CatalogoCalificacionVo catalogoCalificacionVoOut = null;
		try{
			catalogoCalificacionVoOut = catalogoCalificacionBusiness.crearCatalogoCalificacionBusiness(catalogoCalificacionVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoCalificacionVoOut;
	}

	@Override
	public CatalogoCalificacionVo modificarCatalogoCalificacionService(CatalogoCalificacionVo catalogoCalificacionVo)
			throws Exception {
		CatalogoCalificacionVo catalogoCalificacionVoOut = null;
		try{
			catalogoCalificacionVoOut = catalogoCalificacionBusiness.modificarCatalogoCalificacionBusiness(catalogoCalificacionVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoCalificacionVoOut;
	}

	@Override
	public List<CatalogoCalificacionVo> consultarCatalogoCalificacionService(String idCalificacion) throws Exception {
		List<CatalogoCalificacionVo> listaCatalogoCalificacionVoOut = null;
		try{
			listaCatalogoCalificacionVoOut = catalogoCalificacionBusiness.consultarCatalogoCalificacionBusiness(idCalificacion);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listaCatalogoCalificacionVoOut;
	}
}
