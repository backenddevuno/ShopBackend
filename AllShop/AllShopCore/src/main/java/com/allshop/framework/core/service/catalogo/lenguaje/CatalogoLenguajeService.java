package com.allshop.framework.core.service.catalogo.lenguaje;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoLenguajeOut;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoLenguajeIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoLenguajeOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoLenguajeIn;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoLenguajeOut;

public interface CatalogoLenguajeService {
	CrearCatalogoLenguajeOut crearCatalogoLenguaje(CrearCatalogoLenguajeIn crearCatalogoLenguajeIn);
	ModificarCatalogoLenguajeOut modificarCatalogoLenguaje(ModificarCatalogoLenguajeIn modificarCatalogoLenguajeIn);
	ConsultarCatalogoLenguajeOut consultarCatalogoLenguaje(String idLenguaje);
}
