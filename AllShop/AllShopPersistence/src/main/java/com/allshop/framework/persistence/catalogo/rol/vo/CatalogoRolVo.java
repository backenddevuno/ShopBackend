package com.allshop.framework.persistence.catalogo.rol.vo;

import com.allshop.framework.persistence.common.ElementosComunesVo;

public class CatalogoRolVo {
	protected long langTpCd;
	protected long idRol;
	protected String descRol;
	protected ElementosComunesVo elementosComunesVo;

	public long getLangTpCd() {
		return langTpCd;
	}

	public void setLangTpCd(long langTpCd) {
		this.langTpCd = langTpCd;
	}

	public long getIdRol() {
		return idRol;
	}

	public void setIdRol(long idRol) {
		this.idRol = idRol;
	}

	public String getDescRol() {
		return descRol;
	}

	public void setDescRol(String descRol) {
		this.descRol = descRol;
	}

	public ElementosComunesVo getElementosComunesVo() {
		return elementosComunesVo;
	}

	public void setElementosComunesVo(ElementosComunesVo elementosComunesVo) {
		this.elementosComunesVo = elementosComunesVo;
	}

}
