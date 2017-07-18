package com.allshop.framework.persistence.catalogo.categoria.vo;

import com.allshop.framework.persistence.common.ElementosComunesVo;

public class CatalogoCategoriaVo {
	protected long langTpCd;
	protected long idCategoria;
	protected String descCategoria;
	protected ElementosComunesVo elementosComunesVo;

	public long getLangTpCd() {
		return langTpCd;
	}

	public void setLangTpCd(long langTpCd) {
		this.langTpCd = langTpCd;
	}

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescCategoria() {
		return descCategoria;
	}

	public void setDescCategoria(String descCategoria) {
		this.descCategoria = descCategoria;
	}

	public ElementosComunesVo getElementosComunesVo() {
		return elementosComunesVo;
	}

	public void setElementosComunesVo(ElementosComunesVo elementosComunesVo) {
		this.elementosComunesVo = elementosComunesVo;
	}

}
