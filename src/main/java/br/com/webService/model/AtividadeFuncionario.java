package br.com.webService.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AtividadeFuncionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private int porcentagem;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "atividades_id")
	private Atividade atividade;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	
	
	
	

}
