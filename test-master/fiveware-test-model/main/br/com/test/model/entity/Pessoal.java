package br.com.test.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pessoal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100)
	private String nome;
	
	private Integer idade;
	
	@Column(length=1)
	private String estadoCivil;
	
	private boolean temFilhos;
	
	private Integer qtdFilhos;
	
	private String conhecimentos;
	
	@OneToMany(mappedBy="pessoal", cascade=CascadeType.ALL , fetch =FetchType.LAZY)
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
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

	public Integer getQtdFilhos() {
		return qtdFilhos;
	}

	public void setQtdFilhos(Integer qtdFilhos) {
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
