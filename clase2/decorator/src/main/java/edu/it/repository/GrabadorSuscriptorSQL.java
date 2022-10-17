package edu.it.repository;

import edu.it.components.ConectorJPA;
import edu.it.dtos.Suscriptor;

public class GrabadorSuscriptorSQL implements GrabadorSuscriptor {

	@Override
	public void grabar(Suscriptor suscriptor) {
		var entityManager = new ConectorJPA().getEntityManager();
		var tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(suscriptor);
		tx.commit();
		
	}

}
