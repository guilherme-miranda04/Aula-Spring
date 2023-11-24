package com.example.Aula.model.dto;

import java.util.Objects;

import com.example.Aula.model.Contato;

public class ContatoDTO {

	private Long id;
	private String nome, email, observacao;
	
	public ContatoDTO() {
	}
	
	public ContatoDTO(Long id, String nome, String email, String observacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.observacao = observacao;
	}

	public ContatoDTO(Contato contato) {
		this.id = contato.getId();
		this.nome = contato.getNome();
		this.email = contato.getEmail();
		this.observacao = contato.getObservacao();
	}
	
	public Contato returnModel() {
		Contato contato = new Contato();
		
		if (this.id != null) {
			contato.setId(this.id);
		} else {
			Objects.nonNull(null);
		}
		contato.setNome(this.nome);
		contato.setEmail(this.email);
		contato.setObservacao(this.observacao);
		return contato;
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