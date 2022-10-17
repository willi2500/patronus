package edu.it.factories;

import edu.it.repository.GrabadorSuscriptor;
import edu.it.repository.GrabadorSuscriptorJSON;
import edu.it.repository.GrabadorSuscriptorSQL;
import edu.it.service.LectorSuscriptor;

public class Factory {
	public static GrabadorSuscriptor obtenerEstrategiaGrabadorSuscriptor() {
		try {
			return (GrabadorSuscriptor)Class
				.forName(System.getenv("grabador"))
				.getConstructor()
				.newInstance(null);
		}
		catch (Exception ex) {
			throw new RuntimeException("No se pudo construir el objeto");
		}
	}
	public static GrabadorSuscriptor obtenerGrabadorSuscriptorWrapper() {
		return new edu.it.repository.GrabadorSQLOJson(new GrabadorSuscriptorSQL(), new GrabadorSuscriptorJSON());
	}
	public static LectorSuscriptor obtenerLectorSuscriptor() {
		return new edu.it.service.LectorSuscriptorConsola();
	}
}
