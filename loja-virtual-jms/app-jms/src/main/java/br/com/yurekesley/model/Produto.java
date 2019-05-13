package br.com.yurekesley.model;

public class Produto implements Comparable<Produto> {
	
	private String id;
	private String descricao;

	public Produto(String id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public int compareTo(Produto o) {
		return this.id.compareTo(o.id);
	}

}
