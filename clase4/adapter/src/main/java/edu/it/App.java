package edu.it;

import edu.it.factories.Factory;
import edu.it.services.ServicioDiscador;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");

        new ServicioDiscador(Factory.crearDiscador()).run();
    }
}
