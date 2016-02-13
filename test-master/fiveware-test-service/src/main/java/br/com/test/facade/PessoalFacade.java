package br.com.test.facade;

import java.util.ArrayList;

import javax.inject.Inject;

import br.com.test.dao.PessoalDao;
import br.com.test.dto.FormularioDto;
import br.com.test.model.Endereco;
import br.com.test.model.Pessoal;

public class PessoalFacade {
	
	@Inject
	private PessoalDao pessoalDao	;
	
	public PessoalFacade() {
		// TODO Auto-generated constructor stub
	}
	
	public void salvar(FormularioDto dto){
		
		Pessoal pessoal = criarPessoal(dto);
		Endereco endereco = criarEndereco(dto);
		endereco.setPessoal(pessoal);
		
		
		pessoal.setEnderecos( new ArrayList<Endereco>() );
		pessoal.getEnderecos().add(endereco);
		
		pessoalDao.salvar(pessoal);
		
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
