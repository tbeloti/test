package br.com.test.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.test.model.Pessoal;

public class PessoalDao {
	
	private static List<Pessoal> list = new ArrayList<>();
	
	public PessoalDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void salvar(Pessoal pessoal){
		list.add(pessoal);
		
		System.out.println("Totol Registros " + list.size());
	}
	
}
