package edu.it.service;

import java.util.Scanner;
import java.util.UUID;

import edu.it.dtos.Suscriptor;

public class LectorSuscriptorConsola implements LectorSuscriptor {

	@Override
	public Suscriptor leer() {
		var suscriptor = new Suscriptor();
		var scn = new Scanner(System.in);
		
		suscriptor.id = UUID.randomUUID().toString();
		System.out.println("Ingrese cliente");
		suscriptor.nombre = scn.nextLine();
		System.out.println("Ingrese modelo");
		suscriptor.modelo = scn.nextLine();
		
		return suscriptor;
	}

}
