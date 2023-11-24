package com.example.Aula.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table( name = "tb_compromisso")
public class Compromisso {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 50, nullable = false)
	private String local;
	@Column(length = 100, nullable = false)
	private String data;
	@Column(length = 100, nullable = false)
	private String hora;
	@Column(length = 100, nullable = false)
	private String status;
	@Column(length = 100, nullable = false)
	private String idcontato;
	
	
	
	
	@Transient
	private String observacao;

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getLocal() {
		return local;
	}



	public void setLocal(String local) {
		this.local = local;
	}






	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public String getHora() {
		return hora;
	}



	public void setHora(String hora) {
		this.hora = hora;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getIdcontato() {
		return idcontato;
	}



	public void setIdcontato(String idcontato) {
		this.idcontato = idcontato;
	}



	public String getObservacao() {
		return observacao;
	}



	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public Compromisso(int id, String local, String contato, String data, String hora, String status, String idcontato,
			String observacao) {
		super();
		this.id = id;
		this.local = local;
		this.data = data;
		this.hora = hora;
		this.status = status;
		this.idcontato = idcontato;
		this.observacao = observacao;
	}



	public Compromisso() {

	}

}
