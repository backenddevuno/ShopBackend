package com.allshop.framework.business.catalogo.pago;

import java.util.List;

import com.allshop.framework.persistence.catalogo.pago.vo.CatalogoPagoVo;

public interface CatalogoPagoBusiness {
	CatalogoPagoVo crearCatalogoPagoBusiness(CatalogoPagoVo catalogoPagoVo) throws Exception;
	CatalogoPagoVo modificarCatalogoPagoBusiness(CatalogoPagoVo catalogoPagoVo) throws Exception;
	List<CatalogoPagoVo> consultarCatalogoPagoBusiness(String idPago) throws Exception;
}
