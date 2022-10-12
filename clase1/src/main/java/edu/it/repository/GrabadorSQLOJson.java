package edu.it.repository;

import edu.it.dtos.Suscriptor;

public class GrabadorSQLOJson implements GrabadorSuscriptor {
	private GrabadorSuscriptor grabadorSQL;
	private GrabadorSuscriptor grabadorJSON;
	
	public GrabadorSQLOJson(GrabadorSuscriptor grabadorSQL, GrabadorSuscriptor grabadorJSON) {
		this.grabadorSQL = grabadorSQL;
		this.grabadorJSON = grabadorJSON;
	}
	
	public void grabar(Suscriptor suscriptor) {
		try {
			grabadorSQL.grabar(suscriptor);
		}
		catch (RuntimeException ex) {
			grabadorJSON.grabar(suscriptor);
		}
	}
}
