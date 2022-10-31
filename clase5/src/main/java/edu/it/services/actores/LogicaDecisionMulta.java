package edu.it.services.actores;

import java.util.UUID;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.google.gson.Gson;

import edu.it.dto.Mensaje;
import edu.it.dto.Ticket;
import edu.it.services.Actor;

public class LogicaDecisionMulta extends Actor {
	protected void onNewMessage(String strDatosvehiculo) {
		DatosVehiculo datosVehiculo = new Gson().fromJson(strDatosvehiculo, DatosVehiculo.class);
		
		if (datosVehiculo.velocidadMedida < 100) {
			System.out.println("NO CORRESPONDE MULTA PARA LA PANTENTE: " + datosVehiculo.patente);
			return;
		}
		
		var ticket = new Ticket();
		ticket.IDTicket = UUID.randomUUID().toString();
		ticket.patente = datosVehiculo.patente;
		ticket.tipoVehiculo = datosVehiculo.tipoVehiculo;
		ticket.tipoClima = TipoClima.LLUVIAS_MODERADAS;
		ticket.limitePermitido = 100;
		ticket.VelocidadMedida = datosVehiculo.velocidadMedida;
		
		var strTicket = new Gson().toJson(ticket);
		var msg = new Mensaje("edu.it.patronus.actormodel.actordb", strTicket);
		
		this.broker.enviarMensaje(msg);
	}
}
