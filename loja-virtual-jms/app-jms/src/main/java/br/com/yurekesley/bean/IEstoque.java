package br.com.yurekesley.bean;

import java.util.List;

import javax.ejb.Local;

import br.com.yurekesley.model.Produto;

@Local
public interface IEstoque {

	public List<Produto> getProdutos();

	public void adcionarProduto(Produto produto);

	public Produto getProdutoPorID(String produtoID);

	public void removerProduto(Produto produto);

	public Integer getQuantidade();
}
