package com.allshop.framework.core.service.catalogo.moneda;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoMonedaOut;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoMonedaIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoMonedaOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoMonedaIn;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoMonedaOut;

public interface CatalogoMonedaService {
	CrearCatalogoMonedaOut crearCatalogoMoneda(CrearCatalogoMonedaIn crearCatalogoMonedaIn);
	ModificarCatalogoMonedaOut modificarCatalogoMoneda(ModificarCatalogoMonedaIn modificarCatalogoMonedaIn);
	ConsultarCatalogoMonedaOut consultarCatalogoMoneda(String idMoneda);
}
