package edu.it.factories;

import edu.it.repository.GrabadorSuscriptor;
import edu.it.repository.GrabadorSuscriptorJSON;
import edu.it.repository.GrabadorSuscriptorSQL;
import edu.it.service.LectorSuscriptor;

public class Factory {
	public static GrabadorSuscriptor obtenerGrabadorSuscriptor() {
		return new edu.it.repository.GrabadorSQLOJson(new GrabadorSuscriptorSQL(), new GrabadorSuscriptorJSON());
	}
	public static LectorSuscriptor obtenerLectorSuscriptor() {
		return new edu.it.service.LectorSuscriptorConsola();
	}
}
