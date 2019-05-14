package br.com.yurekesley.service;


import java.util.List;

import javax.ejb.Local;

import br.com.yurekesley.model.Produto;

@Local
public interface IProduto {
	public List<Produto> getProdutosEmEstoque();
	
	public Integer getQuantidadeProdutosEmEstoque();
}
