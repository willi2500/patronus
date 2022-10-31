package edu.it.services;

import edu.it.dto.Mensaje;
import edu.it.dto.Suscriptor;

public class NullObjectBroker implements Broker {
	public void suscribe(Suscriptor sus) {
	}
	public void enviarMensaje(Mensaje mensaje) {
	}
}
