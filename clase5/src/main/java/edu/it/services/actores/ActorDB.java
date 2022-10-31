package edu.it.services.actores;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.TipoVehiculo;

import edu.it.services.Actor;

public class ActorDB extends Actor {	
	protected void onNewMessage(String ticket) {
		System.out.println("Ticket");
		System.out.println(ticket);
	}
}
