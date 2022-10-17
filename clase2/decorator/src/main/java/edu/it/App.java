package edu.it;

import edu.it.factories.Factory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        //var z = Factory.obtenerLectorSuscriptor().leer();
        //Factory.obtenerEstrategiaGrabadorSuscriptor().grabar(z);
        
        new EjemploDecoratorFalopardi().run();
    }
}
