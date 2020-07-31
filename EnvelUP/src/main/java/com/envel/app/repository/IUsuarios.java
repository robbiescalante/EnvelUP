package com.envel.app.repository;

import com.envel.app.entity.Usuarios;

public interface IUsuarios {

	Usuarios[] getAllUsers();
	void createUser(Usuarios usuario);
	Usuarios userByKey(String key);
	
	
}
