package br.com.yurekesley.model;

import java.io.Serializable;

public class Produto implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String nome;
	private Double valor;

	public Produto(String codigo, String nome, Double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
