package com.allshop.framework.core.service.catalogo.pago;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoPagoOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoPagoInType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoPagoOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoPagoInType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoPagoOutType;

public interface CatalogoPagoService {
	CrearCatalogoPagoOutType crearCatalogoPago(CrearCatalogoPagoInType crearCatalogoPagoInType);
	ModificarCatalogoPagoOutType modificarCatalogoPago(ModificarCatalogoPagoInType modificarCatalogoPagoInType);
	ConsultarCatalogoPagoOutType consultarCatalogoPago(String idPago);
}
