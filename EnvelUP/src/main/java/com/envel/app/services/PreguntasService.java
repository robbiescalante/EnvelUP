package com.envel.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.envel.app.entity.Preguntas;
import com.envel.app.repository.IPreguntas;

@Service
public class PreguntasService implements IPreguntas{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Preguntas[] todasPreguntas() {
		String url = "https://envelservice.azurewebsites.net/api/Pregunta";
		Preguntas[] response = restTemplate.getForObject(url, Preguntas[].class);
		return response;
	}

	@Override
	public void nuevoRol(Preguntas pregunta) {
		String url = "https://envelservice.azurewebsites.net/api/Pregunta";
		restTemplate.postForObject(url, pregunta, String.class);
	}

}
