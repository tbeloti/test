package br.com.test.model.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import br.com.test.model.conf.JPAEntityManagerFactory;
import br.com.test.model.repository.BasicRepository;

public class BasicRepositoryImpl <T> implements BasicRepository<T>  {
	
	protected final Class<T> classe;

	
	EntityManager em;
	
	public BasicRepositoryImpl(Class<T> classe) {
		this.classe = classe;
		em = JPAEntityManagerFactory.getEntityManager();
	}

	public void adiciona(T t) {

		// abre transacao
		em.getTransaction().begin();

		// persiste o objeto
		em.persist(t);

		// commita a transacao
		em.getTransaction().commit();


	}

	public List<T> listaTodos() {
		
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));

		List<T> lista = em.createQuery(query).getResultList();

		return lista;
	}

	public T buscaPorId(Long id) {
		T instancia = em.find(classe, id);
		
		return instancia;
	}

	
	
}
