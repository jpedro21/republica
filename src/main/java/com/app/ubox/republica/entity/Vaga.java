package com.app.ubox.republica.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vaga {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
//	private List<Usuario> listUsuario;
//	private Residencia redidencia;
	private Integer qtdVagas;
	private Sexo prefSexo;
	private BigDecimal valor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public List<Usuario> getListUsuario() {
//		return listUsuario;
//	}
//	public void setListUsuario(List<Usuario> listUsuario) {
//		this.listUsuario = listUsuario;
//	}
//	public Residencia getRedidencia() {
//		return redidencia;
//	}
//	public void setRedidencia(Residencia redidencia) {
//		this.redidencia = redidencia;
//	}
	public Integer getQtdVagas() {
		return qtdVagas;
	}
	public void setQtdVagas(Integer qtdVagas) {
		this.qtdVagas = qtdVagas;
	}
	public Sexo getPrefSexo() {
		return prefSexo;
	}
	public void setPrefSexo(Sexo prefSexo) {
		this.prefSexo = prefSexo;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
