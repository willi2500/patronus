package edu.it.ejemplosioc;


abstract class Template {
	public void hacerDesarrollo() {
		hacerEsquema();
		escribir();
		testear();
	}
	abstract void hacerEsquema();
	abstract void escribir();
	abstract void testear();
}

class DesarrolloEnJava extends Template {
	void hacerEsquema() {
		System.out.println("Hacer un UML");
	}
	
	void escribir() {
		System.out.println("Escribir el codigo en InteliJ");
	}

	void testear() {
		System.out.println("Correr Test unitarios");
	}
}

class DesarrolloUnaMotocicleta extends Template {
	void hacerEsquema() {
		System.out.println("Diseñar en autocad");
	}
	
	void escribir() {
		System.out.println("Montar los componentes");
	}

	void testear() {
		System.out.println("Salir a la ruta");
	}
}




public class Ejemplo1 implements Runnable {
	public void run() {
		Template t1 = new DesarrolloEnJava();
		Template t2 = new DesarrolloUnaMotocicleta();
		
		t1.hacerDesarrollo();
		t2.hacerDesarrollo();
	}
}
