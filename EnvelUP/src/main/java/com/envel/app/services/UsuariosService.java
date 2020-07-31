package com.envel.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.envel.app.entity.Usuarios;
import com.envel.app.repository.IUsuarios;

@Service
public class UsuariosService implements IUsuarios {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Usuarios[] getAllUsers() {
		String url = "https://envelservice.azurewebsites.net/api/User/GetAllUsers";
		Usuarios[] response = restTemplate.getForObject(url, Usuarios[].class);
		return response;
	}

	@Override
	public void createUser(Usuarios usuario) {
		String url = "https://envelservice.azurewebsites.net/api/User";
		restTemplate.postForObject(url, usuario, String.class);
		
	}

	@Override
	public Usuarios userByKey(String key) {
		String url = "https://envelservice.azurewebsites.net/api/User/GetUserByKey";
		Usuarios response = restTemplate.getForObject(url, Usuarios.class);
		return response;
	}

}
