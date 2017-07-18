package com.allshop.framework.business.catalogo.calificacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.persistence.catalogo.calificacion.dao.CatalogoCalificacionDao;
import com.allshop.framework.persistence.catalogo.calificacion.vo.CatalogoCalificacionVo;

@Service
public class CatalogoCalificacionBusinessImpl implements CatalogoCalificacionBusiness{

	@Autowired
	protected CatalogoCalificacionDao catalogoCalificacionDao;

	@Override
	public CatalogoCalificacionVo crearCatalogoCalificacionBusiness(CatalogoCalificacionVo catalogoCalificacionVo)
			throws Exception {
		CatalogoCalificacionVo catalogoCalificacionVoOut = null;
		try{
			catalogoCalificacionVoOut =  catalogoCalificacionDao.crearCatalogoCalificacionDao(catalogoCalificacionVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoCalificacionVoOut;
	}

	@Override
	public CatalogoCalificacionVo modificarCatalogoCalificacionBusiness(CatalogoCalificacionVo catalogoCalificacionVo)
			throws Exception {
		CatalogoCalificacionVo catalogoCalificacionVoOut = null;
		try{
			catalogoCalificacionVoOut = catalogoCalificacionDao.modificarCatalogoCalificacionDao(catalogoCalificacionVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoCalificacionVoOut;
	}

	@Override
	public List<CatalogoCalificacionVo> consultarCatalogoCalificacionBusiness(String idCalificacion) throws Exception {
		List<CatalogoCalificacionVo> listCatalogoCalificacionVoOut = null;
		try{
			listCatalogoCalificacionVoOut = catalogoCalificacionDao.consultarCatalogoCalificacionDao(idCalificacion);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listCatalogoCalificacionVoOut;
	}

}
