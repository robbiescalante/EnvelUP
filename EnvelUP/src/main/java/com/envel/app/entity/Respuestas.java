package com.envel.app.entity;

public class Respuestas {

	private String id;
	private String descripcion;
	private boolean esCorrecta;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEsCorrecta() {
		return esCorrecta;
	}
	public void setEsCorrecta(boolean esCorrecta) {
		this.esCorrecta = esCorrecta;
	}
	
}
