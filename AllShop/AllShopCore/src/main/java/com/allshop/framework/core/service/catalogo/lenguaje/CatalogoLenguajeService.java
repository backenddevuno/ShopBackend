package com.allshop.framework.core.service.catalogo.lenguaje;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoLenguajeOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoLenguajeInType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoLenguajeOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoLenguajeInType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoLenguajeOutType;

public interface CatalogoLenguajeService {
	CrearCatalogoLenguajeOutType crearCatalogoLenguaje(CrearCatalogoLenguajeInType crearCatalogoLenguajeInType);
	ModificarCatalogoLenguajeOutType modificarCatalogoLenguaje(ModificarCatalogoLenguajeInType modificarCatalogoLenguajeInType);
	ConsultarCatalogoLenguajeOutType consultarCatalogoLenguaje(String idLenguaje);
}
