package br.com.rest.facade;

import java.util.ArrayList;

import br.com.rest.dto.FormularioDto;
import br.com.test.model.entity.Endereco;
import br.com.test.model.entity.Pessoal;
import br.com.test.model.repository.impl.PessoalRepositoryImpl;

public class PessoalFacade {
	
	
	
	private PessoalRepositoryImpl repository;
	
	public PessoalFacade() {
		
		this.repository = new PessoalRepositoryImpl();
	}
	
	public void salvar(FormularioDto dto){
		
		Pessoal pessoal = criarPessoal(dto);
		Endereco endereco = criarEndereco(dto);
		endereco.setPessoal(pessoal);
		
		
		pessoal.setEnderecos( new ArrayList<Endereco>() );
		pessoal.getEnderecos().add(endereco);
		
		this.repository.adiciona(pessoal);
		
	}
	private Endereco criarEndereco(FormularioDto dto){
		
		Endereco endereco = new Endereco();
		endereco.setBairro(dto.getBairro());
		endereco.setCep(dto.getCep());
		endereco.setLogradouro(dto.getLogradouro());
		endereco.setNumero(dto.getNumero());
		return endereco;
		
	}
	private Pessoal criarPessoal(FormularioDto dto){
		Pessoal pessoal =  new Pessoal();
		pessoal.setNome(dto.getNome());
		pessoal.setIdade(dto.getIdade());
		pessoal.setQtdFilhos(dto.getQtdFilhos());
		pessoal.setEstadoCivil(dto.getEstadoCivil());
		pessoal.setTemFilhos(dto.isTemFilhos());
		StringBuffer buffer = new StringBuffer(""); 
		for( String valor : dto.getConhecimentos() ){
			buffer.append(   " " + valor);
		}
		
		pessoal.setConhecimentos( buffer.length() == 0 ? null : buffer.toString() );
		return pessoal;
	}

}
