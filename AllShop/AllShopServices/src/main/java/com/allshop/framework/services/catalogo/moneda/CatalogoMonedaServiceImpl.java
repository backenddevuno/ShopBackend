package com.allshop.framework.services.catalogo.moneda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.business.catalogo.moneda.CatalogoMonedaBusiness;
import com.allshop.framework.persistence.catalogo.moneda.vo.CatalogoMonedaVo;

@Service
public class CatalogoMonedaServiceImpl implements CatalogoMonedaService{
	@Autowired
	protected CatalogoMonedaBusiness catalogoMonedaBusiness;

	@Override
	public CatalogoMonedaVo crearCatalogoMonedaService(CatalogoMonedaVo catalogoMonedaVo) throws Exception {
		CatalogoMonedaVo catalogoMonedaVoOut = null;
		try{
			catalogoMonedaVoOut = catalogoMonedaBusiness.crearCatalogoMonedaBusiness(catalogoMonedaVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoMonedaVoOut;
	}

	@Override
	public CatalogoMonedaVo modificarCatalogoMonedaService(CatalogoMonedaVo catalogoMonedaVo) throws Exception {
		CatalogoMonedaVo catalogoMonedaVoOut = null;
		try{
			catalogoMonedaVoOut = catalogoMonedaBusiness.modificarCatalogoMonedaBusiness(catalogoMonedaVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoMonedaVoOut;
	}

	@Override
	public List<CatalogoMonedaVo> consultarCatalogoMonedaService(String idMoneda) throws Exception {
		List<CatalogoMonedaVo> listaCatalogoMonedaVoOut = null;
		try{
			listaCatalogoMonedaVoOut = catalogoMonedaBusiness.consultarCatalogoMonedaBusiness(idMoneda);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listaCatalogoMonedaVoOut;
	}
}
