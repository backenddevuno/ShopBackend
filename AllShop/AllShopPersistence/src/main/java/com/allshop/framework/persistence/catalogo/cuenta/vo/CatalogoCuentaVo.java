package com.allshop.framework.persistence.catalogo.cuenta.vo;

import com.allshop.framework.persistence.common.ElementosComunesVo;

public class CatalogoCuentaVo {
	protected long langTpCd;
	protected long idCuenta;
	protected String descCuenta;
	protected ElementosComunesVo elementosComunesVo;

	public long getLangTpCd() {
		return langTpCd;
	}

	public void setLangTpCd(long langTpCd) {
		this.langTpCd = langTpCd;
	}

	public long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getDescCuenta() {
		return descCuenta;
	}

	public void setDescCuenta(String descCuenta) {
		this.descCuenta = descCuenta;
	}

	public ElementosComunesVo getElementosComunesVo() {
		return elementosComunesVo;
	}

	public void setElementosComunesVo(ElementosComunesVo elementosComunesVo) {
		this.elementosComunesVo = elementosComunesVo;
	}

}
