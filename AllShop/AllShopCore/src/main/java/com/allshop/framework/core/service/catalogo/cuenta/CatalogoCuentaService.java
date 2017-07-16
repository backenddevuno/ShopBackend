package com.allshop.framework.core.service.catalogo.cuenta;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoCuentaOut;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoCuentaIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoCuentaOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoCuentaIn;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoCuentaOut;

public interface CatalogoCuentaService {
	CrearCatalogoCuentaOut crearCatalogoCuenta(CrearCatalogoCuentaIn crearCatalogoCuentaIn);
	ModificarCatalogoCuentaOut modificarCatalogoCuenta(ModificarCatalogoCuentaIn modificarCatalogoCuentaIn);
	ConsultarCatalogoCuentaOut consultarCatalogoCuenta(String idCuenta);
}
