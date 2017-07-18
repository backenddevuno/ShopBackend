package com.allshop.framework.persistence.catalogo.calificacion.vo;

import com.allshop.framework.persistence.common.ElementosComunesVo;

public class CatalogoCalificacionVo {
	protected long langTpCd;
	protected long idCalificacion;
	protected String descCalificacion;
	protected ElementosComunesVo elementosComunesVo;

	public long getLangTpCd() {
		return langTpCd;
	}

	public void setLangTpCd(long langTpCd) {
		this.langTpCd = langTpCd;
	}

	public long getIdCalificacion() {
		return idCalificacion;
	}

	public void setIdCalificacion(long idCalificacion) {
		this.idCalificacion = idCalificacion;
	}

	public String getDescCalificacion() {
		return descCalificacion;
	}

	public void setDescCalificacion(String descCalificacion) {
		this.descCalificacion = descCalificacion;
	}

	public ElementosComunesVo getElementosComunesVo() {
		return elementosComunesVo;
	}

	public void setElementosComunesVo(ElementosComunesVo elementosComunesVo) {
		this.elementosComunesVo = elementosComunesVo;
	}

}
