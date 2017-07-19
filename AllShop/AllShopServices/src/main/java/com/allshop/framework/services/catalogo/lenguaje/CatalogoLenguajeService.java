package com.allshop.framework.services.catalogo.lenguaje;

import java.util.List;

import com.allshop.framework.persistence.catalogo.lenguaje.vo.CatalogoLenguajeVo;

public interface CatalogoLenguajeService {
	CatalogoLenguajeVo crearCatalogoLenguajeService(CatalogoLenguajeVo catalogoLenguajeVo) throws Exception;
	CatalogoLenguajeVo modificarCatalogoLenguajeService(CatalogoLenguajeVo catalogoLenguajeVo) throws Exception;
	List<CatalogoLenguajeVo> consultarCatalogoLenguajeService(String idLenguaje) throws Exception;
}
