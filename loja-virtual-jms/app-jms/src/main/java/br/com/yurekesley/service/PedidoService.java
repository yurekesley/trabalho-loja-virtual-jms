package br.com.yurekesley.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.yurekesley.AppRepository;
import br.com.yurekesley.model.Pedido;
import br.com.yurekesley.model.Produto;

@Stateless
public class PedidoService {

	private Pedido pedido;

	@Inject
	private AppRepository repository;

	public void adicionarProdutoNoPedido(Produto p) {

		if (pedido.getProdutos() != null) {
			pedido.getProdutos().add(p);
		}
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
