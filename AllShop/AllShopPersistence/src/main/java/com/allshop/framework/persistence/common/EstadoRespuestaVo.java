package com.allshop.framework.persistence.common;

public class EstadoRespuestaVo {
    protected String id;
    protected String mensajeAUsuario;
    protected String mensajeDetallado;
    protected Integer nivelSegRequerido;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMensajeAUsuario() {
		return mensajeAUsuario;
	}
	public void setMensajeAUsuario(String mensajeAUsuario) {
		this.mensajeAUsuario = mensajeAUsuario;
	}
	public String getMensajeDetallado() {
		return mensajeDetallado;
	}
	public void setMensajeDetallado(String mensajeDetallado) {
		this.mensajeDetallado = mensajeDetallado;
	}
	public Integer getNivelSegRequerido() {
		return nivelSegRequerido;
	}
	public void setNivelSegRequerido(Integer nivelSegRequerido) {
		this.nivelSegRequerido = nivelSegRequerido;
	}
    
}
