package com.envel.app.methods;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;

import com.envel.app.entity.Preguntas;
import com.envel.app.entity.Roles;
import com.envel.app.entity.Tips;
import com.envel.app.entity.Usuarios;
import com.envel.app.services.PreguntasService;
import com.envel.app.services.RolesService;
import com.envel.app.services.TipsService;
import com.envel.app.services.UsuariosService;


public class Metodos {

	@Autowired
	private TipsService ts;
	
	@Autowired
	private RolesService rs;
	
	@Autowired
	private PreguntasService ps;
	
	@Autowired
	private UsuariosService us;
	

	public Tips[] getAllTips() {
		return ts.todosTips();
	}
	

	public Tips tipsByName(@RequestBody Tips encabezado) {
		Tips[] response = ts.todosTips();
		Tips arreglo = null;
		for (Tips tip : response) {
			if (tip.getEncabezado().equals(encabezado.getEncabezado())) {
				arreglo = tip;
				break;
			}
		}
		return arreglo;
	}	
	

	public Usuarios getUserByName(@RequestBody Usuarios usuario) {
		Usuarios[] response = us.getAllUsers();
		Usuarios arreglo = null;
		for (Usuarios user : response) {
			if (user.getUsuario().equals(usuario.getUsuario())) {
				arreglo = user;
				break;
			}
		}
		return arreglo;
	}
	

	public Usuarios getUserByEmail(@RequestBody Usuarios usuario) {
		Usuarios[] response = us.getAllUsers();
		Usuarios arreglo = null;
		for (Usuarios user : response) {
			if (user.getEmail().equals(usuario.getEmail())) {
				arreglo = user;
				break;
			}
		}
		return arreglo;
	}
	

	public Usuarios getUserByRol(@RequestBody Usuarios usuario) {
		Usuarios[] response = us.getAllUsers();
		Usuarios arreglo = null;
		for (Usuarios user : response) {
			if (user.getRolId().equals(usuario.getRolId())) {
				arreglo = user;
				break;
			}
		}
		return arreglo;
	}
	

	public Usuarios getUserByRolPref(@RequestBody Usuarios usuario) {
		Usuarios[] response = us.getAllUsers();
		Usuarios arreglo = null;
		for (Usuarios user : response) {
			if (user.getRolesPreferentes().equals(usuario.getRolesPreferentes())) {
				arreglo = user;
				break;
			}
		}
		return arreglo;
	}
	

	public Roles[] getAllRoles() {
		return rs.todosRoles();
	}
	

	public void createRol(@RequestBody Roles rol) {
			rs.nuevoRol(rol);
	}
	

	public Preguntas[] getAllQuestions() {
		return ps.todasPreguntas();
	}
	

	public void createQuestion(@RequestBody Preguntas pregunta) {
		ps.nuevoRol(pregunta);
	}
	

	public Usuarios[] getAllUsers() {
		return us.getAllUsers();
	}
	

	public void createUser(@RequestBody Usuarios usuario) {
	us.createUser(usuario);
	}
	
	

}
