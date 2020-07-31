package com.envel.app.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.envel.app.entity.Roles;
import com.envel.app.repository.IRoles;

@Service
public class RolesService implements IRoles{

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Roles[] todosRoles() {
		String url = "https://envelservice.azurewebsites.net/api/Rol";
		Roles[] response = restTemplate.getForObject(url, Roles[].class);
		return response;
	}

	@Override
	public void nuevoRol(Roles rol) {
	
		String url = "https://envelservice.azurewebsites.net/api/Rol";
		restTemplate.postForObject(url, rol, String.class);
		
	}
	

	
}
