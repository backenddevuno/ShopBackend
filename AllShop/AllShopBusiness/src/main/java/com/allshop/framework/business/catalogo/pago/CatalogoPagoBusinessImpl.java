package com.allshop.framework.business.catalogo.pago;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.persistence.catalogo.pago.dao.CatalogoPagoDao;
import com.allshop.framework.persistence.catalogo.pago.vo.CatalogoPagoVo;

@Service
public class CatalogoPagoBusinessImpl implements CatalogoPagoBusiness{

	@Autowired
	protected CatalogoPagoDao catalogoPagoDao;
	
	@Override
	public CatalogoPagoVo crearCatalogoPagoBusiness(CatalogoPagoVo catalogoPagoVo) throws Exception {
		CatalogoPagoVo catalogoPagoVoOut = null;
		try{
			catalogoPagoVoOut = catalogoPagoDao.crearCatalogoPagoDao(catalogoPagoVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoPagoVoOut;
	}

	@Override
	public CatalogoPagoVo modificarCatalogoPagoBusiness(CatalogoPagoVo catalogoPagoVo) throws Exception {
		CatalogoPagoVo catalogoPagoVoOut = null;
		try{
			catalogoPagoVoOut = catalogoPagoDao.modificarCatalogoPagoDao(catalogoPagoVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return catalogoPagoVoOut;
	}

	@Override
	public List<CatalogoPagoVo> consultarCatalogoPagoBusiness(String idPago) throws Exception {
		List<CatalogoPagoVo> listCatalogoPagoVoOut = null;
		try{
			listCatalogoPagoVoOut = catalogoPagoDao.consultarCatalogoPagoDao(idPago);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return listCatalogoPagoVoOut;
	}

}
