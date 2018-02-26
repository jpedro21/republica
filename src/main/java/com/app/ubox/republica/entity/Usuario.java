package com.app.ubox.republica.entity;

import org.joda.time.LocalDate;

public class Usuario {
	
	private Long id;
	private String nome;
	private String email;
	private String celular;
	private String telefone;
	private LocalDate dataCad;
	
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
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public LocalDate getDataCad() {
		return dataCad;
	}
	public void setDataCad(LocalDate dataCad) {
		this.dataCad = dataCad;
	}
}
