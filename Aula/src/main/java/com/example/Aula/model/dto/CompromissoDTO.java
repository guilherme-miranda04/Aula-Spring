package com.example.Aula.model.dto;

import java.sql.Date;

import com.example.Aula.model.Compromisso;
import com.example.Aula.model.Contato;

public class CompromissoDTO {

	private Long id;
	private String local;
	private Date intervaloData;
	private ContatoDTO contato;
	
	public CompromissoDTO() {
	}

	public CompromissoDTO(Long id, String local, Date intervaloData, ContatoDTO contato) {
		super();
		this.id = id;
		this.local = local;
		this.intervaloData = intervaloData;
		this.contato = contato;
	}
	
	public CompromissoDTO(Compromisso compromisso) {
		this.id = compromisso.getId();
		this.local = compromisso.getLocal();
		this.intervaloData = compromisso.getIntervalodata();
		this.contato = new ContatoDTO(compromisso.getContato());
	}
	
	public Compromisso returnModel() {
		Compromisso compromisso = new Compromisso();
		
		if (this.id != null) {
			compromisso.setId(this.id);
		} else {
			compromisso.setId(null);
		}
		compromisso.setLocal(this.local);
		compromisso.setIntervalodata(this.intervaloData);
		compromisso.setContato(this.contato.returnModel());
		
		return compromisso;
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

	public Date getIntervaloData() {
		return intervaloData;
	}

	public void setIntervaloData(Date intervaloData) {
		this.intervaloData = intervaloData;
	}

	public ContatoDTO getContato() {
		return contato;
	}

	public void setContato(ContatoDTO contato) {
		this.contato = contato;
	}
}
