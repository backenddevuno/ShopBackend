package com.allshop.framework.core.service.catalogo.categoria;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoCategoriaOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoCategoriaInType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoCategoriaOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoCategoriaInType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoCategoriaOutType;

public interface CatalogoCategoriaService {
	CrearCatalogoCategoriaOutType crearCatalogoCategoria(CrearCatalogoCategoriaInType crearCatalogoCategoriaInType);
	ModificarCatalogoCategoriaOutType modificarCatalogoCategoria(ModificarCatalogoCategoriaInType modificarCatalogoCategoriaInType);
	ConsultarCatalogoCategoriaOutType consultarCatalogoCategoria(String idCategoria);
}
