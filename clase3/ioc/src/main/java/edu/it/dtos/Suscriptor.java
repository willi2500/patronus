package edu.it.dtos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "suscriptores")
public class Suscriptor {
	@Id
	public String id;
	public String nombre;
	public String modelo;
	
	public Suscriptor(String id, String nombre, String modelo) {
		this.id = id;
		this.nombre = nombre;
		this.modelo = modelo;
	}
	public Suscriptor() {}
}
