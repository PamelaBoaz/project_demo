package com.test.test.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cadastro {
	
	private @Id Long id;
	private String nome;
	private String senha;
	
	public Cadastro() {
		super();
	}

	public Cadastro(String nome, String senha) {
		super();
		this.nome = nome;
		this.senha = senha;
	}

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}