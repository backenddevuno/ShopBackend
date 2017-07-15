package com.allshop.framework.core.service.catalogo.cuenta;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoCuentaOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoCuentaInType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoCuentaOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoCuentaInType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoCuentaOutType;

public interface CatalogoCuentaService {
	CrearCatalogoCuentaOutType crearCatalogoCuenta(CrearCatalogoCuentaInType crearCatalogoCuentaInType);
	ModificarCatalogoCuentaOutType modificarCatalogoCuenta(ModificarCatalogoCuentaInType modificarCatalogoCuentaInType);
	ConsultarCatalogoCuentaOutType consultarCatalogoCuenta(String idCuenta);
}
