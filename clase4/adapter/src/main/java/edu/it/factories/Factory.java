package edu.it.factories;

import dialerpluspro.DialerPro;
import edu.it.services.DialerPlusProAdapter;
import edu.it.services.Discador;
import edu.it.services.DiscadorDePotencia;

public class Factory {
	public static Discador crearDiscador() {
		Discador ret = new DialerPlusProAdapter(new DialerPro());
		return ret;
	}
}
