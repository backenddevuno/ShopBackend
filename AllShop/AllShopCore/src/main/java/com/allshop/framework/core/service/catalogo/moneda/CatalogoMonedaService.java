package com.allshop.framework.core.service.catalogo.moneda;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoMonedaOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoMonedaInType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoMonedaOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoMonedaInType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoMonedaOutType;

public interface CatalogoMonedaService {
	CrearCatalogoMonedaOutType crearCatalogoMoneda(CrearCatalogoMonedaInType crearCatalogoMonedaInType);
	ModificarCatalogoMonedaOutType modificarCatalogoMoneda(ModificarCatalogoMonedaInType modificarCatalogoMonedaInType);
	ConsultarCatalogoMonedaOutType consultarCatalogoMoneda(String idMoneda);
}
