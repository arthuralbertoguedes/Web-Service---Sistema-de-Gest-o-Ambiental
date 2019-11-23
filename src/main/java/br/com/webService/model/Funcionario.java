package br.com.webService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String cargo;
	
	private String avaliacao;
	
	private String observacoes;
	
	private int porcentagemAtividadesConcluidas;
	
	private boolean isTreinado;

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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getPorcentagemAtividadesConcluidas() {
		return porcentagemAtividadesConcluidas;
	}

	public void setPorcentagemAtividadesConcluidas(int porcentagemAtividadesConcluidas) {
		this.porcentagemAtividadesConcluidas = porcentagemAtividadesConcluidas;
	}

	public boolean isTreinado() {
		return isTreinado;
	}

	public void setTreinado(boolean isTreinado) {
		this.isTreinado = isTreinado;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
	
	
}
