package com.allshop.framework.services.catalogo.pago;

import java.util.List;

import com.allshop.framework.persistence.catalogo.pago.vo.CatalogoPagoVo;

public interface CatalogoPagoService {
	CatalogoPagoVo crearCatalogoPagoService(CatalogoPagoVo catalogoPagoVo) throws Exception;
	CatalogoPagoVo modificarCatalogoPagoService(CatalogoPagoVo catalogoPagoVo) throws Exception;
	List<CatalogoPagoVo> consultarCatalogoPagoService(String idPago) throws Exception;
}
