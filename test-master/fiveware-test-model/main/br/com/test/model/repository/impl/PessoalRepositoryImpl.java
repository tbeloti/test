package br.com.test.model.repository.impl;

import br.com.test.model.entity.Pessoal;
import br.com.test.model.repository.PessoalRepository;

public class PessoalRepositoryImpl extends BasicRepositoryImpl<Pessoal> implements PessoalRepository {
	
	public PessoalRepositoryImpl(){
		super(Pessoal.class);
	}
}
