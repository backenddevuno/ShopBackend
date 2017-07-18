package com.allshop.framework.persistence.catalogo.lenguaje.dao;

import java.util.List;

import com.allshop.framework.persistence.catalogo.lenguaje.vo.CatalogoLenguajeVo;

public interface CatalogoLenguajeDao {
	CatalogoLenguajeVo crearCatalogoLenguajeDao(CatalogoLenguajeVo catalogoLenguajeVo) throws Exception;
	CatalogoLenguajeVo modificarCatalogoLenguajeDao(CatalogoLenguajeVo catalogoLenguajeVo) throws Exception;
	List<CatalogoLenguajeVo> consultarCatalogoLenguajeDao(String idLenguaje) throws Exception;
}
