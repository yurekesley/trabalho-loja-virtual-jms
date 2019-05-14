package br.com.yurekesley;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;

import br.com.yurekesley.model.Produto;

@Startup
@Singleton
@ApplicationScoped
public class AppRepository {

	private Collection<Produto> produtos = new ArrayList<Produto>();

	@PostConstruct
	public void init() {
		Produto p1 = new Produto("01", "CD DREAM THEATER", 1.21);
		Produto p2 = new Produto("02", "BICICLETA", 845.2);
		produtos.addAll(Arrays.asList(p1, p2));
	}

	public Collection<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}

}
