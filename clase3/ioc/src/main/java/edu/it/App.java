package edu.it;

import java.util.ArrayList;

import edu.it.ejemplosioc.Ejemplo1;
import edu.it.ejemplosioc.Ejemplo2;
import edu.it.ejemplosioc.Ejemplo3;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        var ejemplos = new ArrayList<Runnable>();
        
        ejemplos.add(new Ejemplo1());
        ejemplos.add(new Ejemplo2());
        ejemplos.add(new Ejemplo3());
        
        for (Runnable r : ejemplos) {
        	r.run();
        	System.out.println();
        }
    }
}
