package br.com.test.model;

import java.util.List;





public class Pessoal {

	private Long id;
	
	private String nome;
		
	private int idade;
	
	private String estadoCivil;
	
	private boolean temFilhos;
	
	private int qtdFilhos;
	
	private String conhecimentos;
	
	
	private List<Endereco> Enderecos; 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public boolean isTemFilhos() {
		return temFilhos;
	}

	public void setTemFilhos(boolean temFilhos) {
		this.temFilhos = temFilhos;
	}

	public int getQtdFilhos() {
		return qtdFilhos;
	}

	public void setQtdFilhos(int qtdFilhos) {
		this.qtdFilhos = qtdFilhos;
	}

	public String getConhecimentos() {
		return conhecimentos;
	}

	public void setConhecimentos(String conhecimentos) {
		this.conhecimentos = conhecimentos;
	}

	public List<Endereco> getEnderecos() {
		return Enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		Enderecos = enderecos;
	}
	
	
}
