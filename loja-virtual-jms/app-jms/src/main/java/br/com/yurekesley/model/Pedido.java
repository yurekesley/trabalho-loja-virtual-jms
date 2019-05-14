package br.com.yurekesley.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private Collection<Produto> produtos = new ArrayList<Produto>();

	public Collection<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
