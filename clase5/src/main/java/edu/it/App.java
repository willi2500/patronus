package edu.it;

import java.util.Scanner;

import edu.it.dto.Mensaje;
import edu.it.dto.Suscriptor;
import edu.it.services.MemoryBroker;
import edu.it.services.actores.ActorPrueba;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        MemoryBroker memoryBroker = new MemoryBroker();
        memoryBroker.suscribe(new Suscriptor("edu.it.patronus.actormodel.actorprueba", new ActorPrueba()));
        
        Scanner scn = new Scanner(System.in);
        var line = scn.nextLine();
        memoryBroker.enviarMensaje(new Mensaje("edu.it.patronus.actormodel.actorprueba", line));
        
    }
}
