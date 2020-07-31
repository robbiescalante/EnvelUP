package com.envel.app.entity;

public class Preguntas {

	private String key;
	private String descripcion;
	private Respuestas[] respuestas;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Respuestas[] getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(Respuestas[] respuestas) {
		this.respuestas = respuestas;
	}
	
}
