package com.allshop.framework.persistence.common;

import java.util.Date;

public class HeaderResponseVo {
    protected String idOperacion;
    protected String numReferencia;
    protected Integer totalOcurrencias;
    protected EstadoRespuestaVo estadoRespuesta;
    protected String tokenOperacion;
    protected Date fechaHora;
    
	public String getIdOperacion() {
		return idOperacion;
	}
	public void setIdOperacion(String idOperacion) {
		this.idOperacion = idOperacion;
	}
	public String getNumReferencia() {
		return numReferencia;
	}
	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}
	public Integer getTotalOcurrencias() {
		return totalOcurrencias;
	}
	public void setTotalOcurrencias(Integer totalOcurrencias) {
		this.totalOcurrencias = totalOcurrencias;
	}
	public EstadoRespuestaVo getEstadoRespuesta() {
		return estadoRespuesta;
	}
	public void setEstadoRespuesta(EstadoRespuestaVo estadoRespuesta) {
		this.estadoRespuesta = estadoRespuesta;
	}
	public String getTokenOperacion() {
		return tokenOperacion;
	}
	public void setTokenOperacion(String tokenOperacion) {
		this.tokenOperacion = tokenOperacion;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
    
}
