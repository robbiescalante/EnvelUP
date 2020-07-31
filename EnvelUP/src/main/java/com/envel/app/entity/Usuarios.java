package com.envel.app.entity;

public class Usuarios {

	private String usuario;
	private String rolId;
	private String rolNombre;
	private String email;
	private String telefono;
	private String ultimaConexion;
	private String estatus;
	private String descripcion;
	private double limiteBusqueda;
	private double longuitud;
	private double latitud;
	private String[] rolesPreferentes;
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getRolId() {
		return rolId;
	}

	public void setRolId(String rolId) {
		this.rolId = rolId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUltimaConexion() {
		return ultimaConexion;
	}

	public void setUltimaConexion(String ultimaConexion) {
		this.ultimaConexion = ultimaConexion;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getLimiteBusqueda() {
		return limiteBusqueda;
	}

	public void setLimiteBusqueda(double limiteBusqueda) {
		this.limiteBusqueda = limiteBusqueda;
	}

	public double getLonguitud() {
		return longuitud;
	}

	public void setLonguitud(double longuitud) {
		this.longuitud = longuitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public String[] getRolesPreferentes() {
		return rolesPreferentes;
	}

	public void setRolesPreferentes(String[] rolesPreferentes) {
		this.rolesPreferentes = rolesPreferentes;
	}

	public String getRolNombre() {
		return rolNombre;
	}

	public void setRolNombre(String rolNombre) {
		this.rolNombre = rolNombre;
	}


}
