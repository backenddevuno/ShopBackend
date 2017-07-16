package com.allshop.framework.core.service.catalogo.pago;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoPagoOut;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoPagoIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoPagoOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoPagoIn;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoPagoOut;

public interface CatalogoPagoService {
	CrearCatalogoPagoOut crearCatalogoPago(CrearCatalogoPagoIn crearCatalogoPagoIn);
	ModificarCatalogoPagoOut modificarCatalogoPago(ModificarCatalogoPagoIn modificarCatalogoPagoIn);
	ConsultarCatalogoPagoOut consultarCatalogoPago(String idPago);
}
