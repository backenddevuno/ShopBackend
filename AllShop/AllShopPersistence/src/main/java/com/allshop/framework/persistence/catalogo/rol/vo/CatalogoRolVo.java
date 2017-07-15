package com.allshop.framework.persistence.catalogo.rol.vo;

import com.allshop.framework.persistence.common.ElementosComunesVo;

public class CatalogoRolVo {
	protected String langTpCd;
	protected String idRol;
	protected String descRol;
	protected ElementosComunesVo elementosComunesVo;

	public String getLangTpCd() {
		return langTpCd;
	}

	public void setLangTpCd(String langTpCd) {
		this.langTpCd = langTpCd;
	}

	public String getIdRol() {
		return idRol;
	}

	public void setIdRol(String idRol) {
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
