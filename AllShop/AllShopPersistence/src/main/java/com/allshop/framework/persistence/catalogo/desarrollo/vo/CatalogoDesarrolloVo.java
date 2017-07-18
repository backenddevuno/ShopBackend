package com.allshop.framework.persistence.catalogo.desarrollo.vo;

import com.allshop.framework.persistence.common.ElementosComunesVo;

public class CatalogoDesarrolloVo {
	protected long langTpCd;
	protected long idDesarrollo;
	protected String codDesarrollo;
	protected String descDesarrollo;
	protected ElementosComunesVo elementosComunesVo;

	public long getLangTpCd() {
		return langTpCd;
	}

	public void setLangTpCd(long langTpCd) {
		this.langTpCd = langTpCd;
	}

	public long getIdDesarrollo() {
		return idDesarrollo;
	}

	public void setIdDesarrollo(long idDesarrollo) {
		this.idDesarrollo = idDesarrollo;
	}

	public String getCodDesarrollo() {
		return codDesarrollo;
	}

	public void setCodDesarrollo(String codDesarrollo) {
		this.codDesarrollo = codDesarrollo;
	}

	public String getDescDesarrollo() {
		return descDesarrollo;
	}

	public void setDescDesarrollo(String descDesarrollo) {
		this.descDesarrollo = descDesarrollo;
	}

	public ElementosComunesVo getElementosComunesVo() {
		return elementosComunesVo;
	}

	public void setElementosComunesVo(ElementosComunesVo elementosComunesVo) {
		this.elementosComunesVo = elementosComunesVo;
	}

}
