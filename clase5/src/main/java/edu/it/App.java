package edu.it;

import edu.it.dto.Suscriptor;
import edu.it.services.Broker;
import edu.it.services.MemoryBroker;
import edu.it.services.actores.ActorDB;
import edu.it.services.actores.ActorPrueba;
import edu.it.services.actores.LogicaDecisionMulta;
import edu.it.services.actores.SensorPermanente;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        Broker broker = new MemoryBroker();
        
        broker.suscribe(new Suscriptor("edu.it.patronus.actormodel.actorprueba", new ActorPrueba()));
        broker.suscribe(new Suscriptor("edu.it.patronus.actormodel.sensorpermanente", new SensorPermanente()));
        broker.suscribe(new Suscriptor("edu.it.patronus.actormodel.logicamulta", new LogicaDecisionMulta()));
        broker.suscribe(new Suscriptor("edu.it.patronus.actormodel.actordb", new ActorDB()));
    }
}
