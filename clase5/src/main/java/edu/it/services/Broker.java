package edu.it.services;

import edu.it.dto.Mensaje;
import edu.it.dto.Suscriptor;

public interface Broker {
	void suscribe(Suscriptor sus);
	void enviarMensaje(Mensaje mensaje);
}

