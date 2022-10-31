package edu.it.services.actores;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import com.google.gson.Gson;

import edu.it.dto.Mensaje;
import edu.it.services.Actor;

public class SensorPermanente extends Actor {

	private SensorClima sensorClima;
	private SensorVelocidad sensorVelocidad;
	
	public SensorPermanente() {
		sensorClima = new SensorClima();
    	sensorVelocidad = new SensorVelocidad();
    	
    	this.encolarMensaje("");
	}
	
	@Override
	protected void onNewMessage(String t) {
		var datosClima = sensorClima.sensar();
		var datosVehiculo = sensorVelocidad.sensarVehiculo();
		
		var msg = new Mensaje("edu.it.patronus.actormodel.logicamulta", new Gson().toJson(datosVehiculo));
		this.broker.enviarMensaje(msg);
		
		this.encolarMensaje(t);
	}
}
