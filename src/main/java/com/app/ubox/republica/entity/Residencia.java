package com.app.ubox.republica.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Residencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cep;
	private String rua;
	private String complemento;
	private String bairro;
	private String numero;
	private String cidade;
	private String estado;
	private String pais;
	private Integer qtdComodos;
	private Integer qtdQuartos;
	private Integer qtdVagasGaragem;
	private Integer qtdBanheiros;
	private String descricao;
	private boolean indPiscina;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Integer getQtdComodos() {
		return qtdComodos;
	}
	public void setQtdComodos(Integer qtdComodos) {
		this.qtdComodos = qtdComodos;
	}
	public Integer getQtdQuartos() {
		return qtdQuartos;
	}
	public void setQtdQuartos(Integer qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}
	public Integer getQtdVagasGaragem() {
		return qtdVagasGaragem;
	}
	public void setQtdVagasGaragem(Integer qtdVagasGaragem) {
		this.qtdVagasGaragem = qtdVagasGaragem;
	}
	public Integer getQtdBanheiros() {
		return qtdBanheiros;
	}
	public void setQtdBanheiros(Integer qtdBanheiros) {
		this.qtdBanheiros = qtdBanheiros;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isIndPiscina() {
		return indPiscina;
	}
	public void setIndPiscina(boolean indPiscina) {
		this.indPiscina = indPiscina;
	}
}
