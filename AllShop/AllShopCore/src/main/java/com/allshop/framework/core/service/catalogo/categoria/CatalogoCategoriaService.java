package com.allshop.framework.core.service.catalogo.categoria;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoCategoriaOut;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoCategoriaIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoCategoriaOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoCategoriaIn;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoCategoriaOut;

public interface CatalogoCategoriaService {
	CrearCatalogoCategoriaOut crearCatalogoCategoria(CrearCatalogoCategoriaIn crearCatalogoCategoriaIn);
	ModificarCatalogoCategoriaOut modificarCatalogoCategoria(ModificarCatalogoCategoriaIn modificarCatalogoCategoriaIn);
	ConsultarCatalogoCategoriaOut consultarCatalogoCategoria(String idCategoria);
}
