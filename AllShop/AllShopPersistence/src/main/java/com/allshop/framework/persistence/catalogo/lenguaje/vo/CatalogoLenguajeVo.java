package com.allshop.framework.persistence.catalogo.lenguaje.vo;

import com.allshop.framework.persistence.common.ElementosComunesVo;

public class CatalogoLenguajeVo {
	protected long langTpCd;
	protected long idLenguaje;
	protected String descLenguaje;
	protected ElementosComunesVo elementosComunesVo;

	public long getLangTpCd() {
		return langTpCd;
	}

	public void setLangTpCd(long langTpCd) {
		this.langTpCd = langTpCd;
	}

	public long getIdLenguaje() {
		return idLenguaje;
	}

	public void setIdLenguaje(long idLenguaje) {
		this.idLenguaje = idLenguaje;
	}

	public String getDescLenguaje() {
		return descLenguaje;
	}

	public void setDescLenguaje(String descLenguaje) {
		this.descLenguaje = descLenguaje;
	}

	public ElementosComunesVo getElementosComunesVo() {
		return elementosComunesVo;
	}

	public void setElementosComunesVo(ElementosComunesVo elementosComunesVo) {
		this.elementosComunesVo = elementosComunesVo;
	}

}
