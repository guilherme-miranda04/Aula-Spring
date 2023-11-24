package com.example.Aula.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "TB_COMPROMISSO")
public class Compromisso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "COMP_LOCAL", nullable = false)
	private String local;

	@Temporal(TemporalType.DATE)
	@Column(name = "COMP_DATA", nullable = false)
	private Date intervaloData;

	@JoinColumn(name = "COMP_COMPID", nullable = false)
	@ManyToOne(targetEntity = Contato.class, fetch = FetchType.LAZY)
	private Contato contato;

	public Compromisso() {
	}

	public Compromisso(Long id, String local, Date intervalodata, Contato contato) {
		super();
		this.id = id;
		this.local = local;
		this.intervaloData = intervalodata;
		this.contato = contato;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Date getIntervalodata() {
		return intervaloData;
	}

	public void setIntervalodata(Date intervalodata) {
		this.intervaloData = intervalodata;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
}
