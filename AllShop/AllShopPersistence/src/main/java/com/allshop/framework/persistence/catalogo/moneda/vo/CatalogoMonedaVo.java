package com.allshop.framework.persistence.catalogo.moneda.vo;

import com.allshop.framework.persistence.common.ElementosComunesVo;

public class CatalogoMonedaVo {
	protected long langTpCd;
	protected long idMoneda;
	protected String codMoneda;
	protected String descMoneda;
	protected ElementosComunesVo elementosComunesVo;

	public long getLangTpCd() {
		return langTpCd;
	}

	public void setLangTpCd(long langTpCd) {
		this.langTpCd = langTpCd;
	}

	public long getIdMoneda() {
		return idMoneda;
	}

	public void setIdMoneda(long idMoneda) {
		this.idMoneda = idMoneda;
	}

	public String getCodMoneda() {
		return codMoneda;
	}

	public void setCodMoneda(String codMoneda) {
		this.codMoneda = codMoneda;
	}

	public String getDescMoneda() {
		return descMoneda;
	}

	public void setDescMoneda(String descMoneda) {
		this.descMoneda = descMoneda;
	}

	public ElementosComunesVo getElementosComunesVo() {
		return elementosComunesVo;
	}

	public void setElementosComunesVo(ElementosComunesVo elementosComunesVo) {
		this.elementosComunesVo = elementosComunesVo;
	}

}
