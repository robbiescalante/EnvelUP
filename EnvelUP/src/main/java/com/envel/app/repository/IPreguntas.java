package com.envel.app.repository;

import com.envel.app.entity.Preguntas;

public interface IPreguntas {

	Preguntas[] todasPreguntas();
	void nuevoRol(Preguntas pregunta);
}
