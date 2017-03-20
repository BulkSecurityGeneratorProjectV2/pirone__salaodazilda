package br.com.pirone.salaodazilda.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class GenericEntityManager {
	
	protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("salaodazildaPU");
	protected EntityManager em = emf.createEntityManager();
	
	public void salvar(Object objeto) {

		
		em.getTransaction().begin();
		em.persist(objeto);
		em.getTransaction().commit();
	}
	
}
