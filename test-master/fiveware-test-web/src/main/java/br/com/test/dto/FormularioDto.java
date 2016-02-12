package br.com.test.dto;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class FormularioDto { 
	public FormularioDto(){}
	
	private String nome;
	
	private int idade;
	
	private String estadoCivil;
	
	private boolean temFilhos;
	
	private int qtdFilhos;
	
	private String logradouro;
	
	private String numero;
	
	private String cep;
	
	private String bairro;
	
	private String[] conhecimentos;
	

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

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
	public String[] getConhecimentos() {
		return conhecimentos;
	}

	public void setConhecimentos(String[] conhecimentos) {
		this.conhecimentos = conhecimentos;
	}

	@Override
	public String toString() {
		return "FormularioDto [nome=" + nome + ", idade=" + idade + ", estadoCivil=" + estadoCivil + ", temFilhos="
				+ temFilhos + ", qtdFilhos=" + qtdFilhos + ", logradouro=" + logradouro + ", numero=" + numero
				+ ", cep=" + cep + ", bairro=" + bairro + ", conhecimentos=" + Arrays.toString(conhecimentos) + "]";
	}

	
	
	

}
