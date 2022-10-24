package edu.it.factories;

import edu.it.services.DiscadorDePotencia;

public class Factory {
	public static DiscadorDePotencia crearDiscador() {
		return new DiscadorDePotencia();
	}
}
