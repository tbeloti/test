package br.com.test.model.conf;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAEntityManagerFactory {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	static{
		entityManagerFactory = Persistence.createEntityManagerFactory("default");
		entityManager = entityManagerFactory.createEntityManager();
	}
	public static EntityManager getEntityManager(){
		
		if(!entityManager.isOpen()){
			entityManager = entityManagerFactory.createEntityManager();
		}
		
		return entityManager;
		
	}
}
