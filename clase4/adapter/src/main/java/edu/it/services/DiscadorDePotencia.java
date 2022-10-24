package edu.it.services;

import edu.it.model.DatosLlamada;
import edu.it.model.Usuario;
import edu.it.utiles.Util;

public class DiscadorDePotencia {
	public DatosLlamada realizarLlamada(Usuario u) {
		System.out.println("realizando la llamada ....");
		Util.dormir();
		return new DatosLlamada();
	}
	public void emitirMensaje(DatosLlamada datosLlamada) {
		System.out.println("emitiendo mensaje servicio al cliente");
		Util.dormir();
	}
	public void cortar(DatosLlamada datosLlamada) {
		// TODO Auto-generated method stub
		System.out.println("Cortando la llamada ....");
		Util.dormir();
	}
}
