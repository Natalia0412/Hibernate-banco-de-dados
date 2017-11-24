package br.com.etechoracio.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.etechoracio.jpa.enums.TipoFuncionarioEnum;

@Entity
@Table(name = "TB_FUNCIONARIO2")
public class Funcionario {
	@Id
	@GeneratedValue
	@Column(name = "ID_FUNCIONARIO")
	private long id;
	@Column(name = "TX_NOME")
	private String nome;
	@Column(name = "TX_FONE")
	private String fone;
	@Column(name = "TP_FUNCIONARIO")
	@Enumerated(EnumType.STRING)
	private TipoFuncionarioEnum tipo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public TipoFuncionarioEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoFuncionarioEnum tipo) {
		this.tipo = tipo;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Column(name = "DT_CADASTRO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
}
