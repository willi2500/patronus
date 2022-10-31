package edu.it.services.actores;

import edu.it.dto.Mensaje;
import edu.it.services.Actor;

public class ActorPrueba extends Actor {	
	protected void onNewMessage(String t) {
		System.out.println("SoyActorPrueba: " + t);
		Long tl = Long.parseLong(t);
		tl++;
		this.broker.enviarMensaje(new Mensaje("edu.it.patronus.actormodel.actorprueba", String.valueOf(tl)));
	}
}
