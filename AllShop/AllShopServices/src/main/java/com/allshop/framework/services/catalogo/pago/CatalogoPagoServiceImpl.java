package com.allshop.framework.services.catalogo.pago;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.business.catalogo.pago.CatalogoPagoBusiness;
import com.allshop.framework.persistence.catalogo.pago.vo.CatalogoPagoVo;

@Service
public class CatalogoPagoServiceImpl implements CatalogoPagoService{
	
	@Autowired
	protected CatalogoPagoBusiness catalogoPagoBusiness;

	@Override
	public CatalogoPagoVo crearCatalogoPagoService(CatalogoPagoVo catalogoPagoVo) throws Exception {
		CatalogoPagoVo catalogoPagoVoOut = null;
		try{
			catalogoPagoVoOut = catalogoPagoBusiness.crearCatalogoPagoBusiness(catalogoPagoVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoPagoVoOut;
	}

	@Override
	public CatalogoPagoVo modificarCatalogoPagoService(CatalogoPagoVo catalogoPagoVo) throws Exception {
		CatalogoPagoVo catalogoPagoVoOut = null;
		try{
			catalogoPagoVoOut = catalogoPagoBusiness.modificarCatalogoPagoBusiness(catalogoPagoVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoPagoVoOut;
	}

	@Override
	public List<CatalogoPagoVo> consultarCatalogoPagoService(String idPago) throws Exception {
		List<CatalogoPagoVo> listaCatalogoPagoVoOut = null;
		try{
			listaCatalogoPagoVoOut = catalogoPagoBusiness.consultarCatalogoPagoBusiness(idPago);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listaCatalogoPagoVoOut;
	}
}
