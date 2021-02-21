package com.test.test.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Perfil {
	
	private @Id Long id;
	private Cadastro cadastro;
	private String foto;
	
	public Perfil() {
		super();
	}

	public Perfil(Cadastro cadastro, String foto) {
		super();
		this.cadastro = cadastro;
		this.foto = foto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
}
