package com.webservice.exemplo.ExemploRestWebservice.model;

import java.util.Date;

public class PessoaModel {

	private String nome;
	private String naturalidade;
	private String anoNascimento;
	
	
	
	public PessoaModel(String nome, String naturalidade, String anoNascimento) {
		super();
		this.nome = nome;
		this.naturalidade = naturalidade;
		this.anoNascimento = anoNascimento;
	}
	
	
	public PessoaModel() {
		super();
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
	
	
	
	
}
