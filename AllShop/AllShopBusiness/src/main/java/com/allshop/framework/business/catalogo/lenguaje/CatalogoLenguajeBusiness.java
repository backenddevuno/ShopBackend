package com.allshop.framework.business.catalogo.lenguaje;

import java.util.List;

import com.allshop.framework.persistence.catalogo.lenguaje.vo.CatalogoLenguajeVo;

public interface CatalogoLenguajeBusiness {
	CatalogoLenguajeVo crearCatalogoLenguajeBusiness(CatalogoLenguajeVo catalogoLenguajeVo) throws Exception;
	CatalogoLenguajeVo modificarCatalogoLenguajeBusiness(CatalogoLenguajeVo catalogoLenguajeVo) throws Exception;
	List<CatalogoLenguajeVo> consultarCatalogoLenguajeBusiness(String idLenguaje) throws Exception;
}
