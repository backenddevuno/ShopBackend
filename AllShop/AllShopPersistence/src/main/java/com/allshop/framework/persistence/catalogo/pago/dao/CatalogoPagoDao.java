package com.allshop.framework.persistence.catalogo.pago.dao;

import java.util.List;

import com.allshop.framework.persistence.catalogo.pago.vo.CatalogoPagoVo;

public interface CatalogoPagoDao {
	CatalogoPagoVo crearCatalogoPagoDao(CatalogoPagoVo catalogoPagoVo) throws Exception;
	CatalogoPagoVo modificarCatalogoPagoDao(CatalogoPagoVo catalogoPagoVo) throws Exception;
	List<CatalogoPagoVo> consultarCatalogoPagoDao(String idPago) throws Exception;
}
