package br.com.test.model.repository;

import java.util.List;

public interface BasicRepository <T>{
	
	public void adiciona(T t);

	public List<T> listaTodos() ;

	public T buscaPorId(Long id) ;

	
}
