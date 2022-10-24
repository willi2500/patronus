package edu.it.services;

import dialerpluspro.DialerPro;
import dialerpluspro.InfoCall;
import dialerpluspro.User;
import edu.it.model.DatosLlamada;
import edu.it.model.Usuario;

public class DialerPlusProAdapter implements Discador {
	private DialerPro dialerPro;	
	
	public DialerPlusProAdapter(DialerPro dialerPro) {
		this.dialerPro = dialerPro;
	}

	public DatosLlamada realizarLlamada(Usuario u) {
		// TODO Auto-generated method stub
		// Mapear el usuario a User
		var datosLlamada = dialerPro.dial(new User());
		// Mapear infoCall a datos llamada 
		return new DatosLlamada();
	}

	public void emitirMensaje(DatosLlamada datosLlamada) {
		// Mapear datos llamada a infoCall 
		dialerPro.playMessage(new InfoCall());
	}

	public void cortar(DatosLlamada datosLlamada) {
		// Mapear datos llamada a infoCall
		dialerPro.hangup(new InfoCall());
	}

}
