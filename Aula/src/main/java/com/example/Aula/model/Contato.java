package com.example.Aula.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table( name = "TB_CONTATO")
public class Contato {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "CONT_NOME", length = 50, nullable = false)
	private String nome;
	
	@Column(name = "CONT_EMAIL", length = 100, nullable = false)
	private String email;
	
	@Transient
	@Column(name = "CONT_OBS", nullable = false)
	private String observacao;

	public Contato() {
	}
	
	public Contato(Long id, String nome, String email, String observacao) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.observacao = observacao;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
