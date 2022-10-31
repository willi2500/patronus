package edu.it.dto;

import edu.it.services.Actor;

public class Suscriptor {
	public final String nombre;
	public final Actor actor;
	
	public Suscriptor(String nombre, Actor actor) {
		this.actor = actor;
		this.nombre = nombre;
	}
}
