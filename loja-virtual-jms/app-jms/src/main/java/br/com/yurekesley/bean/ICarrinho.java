package br.com.yurekesley.bean;


import java.util.List;

import javax.ejb.Local;

import br.com.yurekesley.model.Produto;


@Local
public interface ICarrinho {
	
	public void adcionarProduto(Produto produto);

	public void removerProduto(Produto removerProduto);
	
	public List<Produto> getProdutos();
	
	public void finalizarCompra();
	
}
