package com.allshop.framework.persistence.catalogo.pago.vo;

import com.allshop.framework.persistence.common.ElementosComunesVo;

public class CatalogoPagoVo {
	protected long langTpCd;
	protected long idPago;
	protected String codPago;
	protected String descPago;
	protected ElementosComunesVo elementosComunesVo;

	public long getLangTpCd() {
		return langTpCd;
	}

	public void setLangTpCd(long langTpCd) {
		this.langTpCd = langTpCd;
	}

	public long getIdPago() {
		return idPago;
	}

	public void setIdPago(long idPago) {
		this.idPago = idPago;
	}

	public String getCodPago() {
		return codPago;
	}

	public void setCodPago(String codPago) {
		this.codPago = codPago;
	}

	public String getDescPago() {
		return descPago;
	}

	public void setDescPago(String descPago) {
		this.descPago = descPago;
	}

	public ElementosComunesVo getElementosComunesVo() {
		return elementosComunesVo;
	}

	public void setElementosComunesVo(ElementosComunesVo elementosComunesVo) {
		this.elementosComunesVo = elementosComunesVo;
	}

}
