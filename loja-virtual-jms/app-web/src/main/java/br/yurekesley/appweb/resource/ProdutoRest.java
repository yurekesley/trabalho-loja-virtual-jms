package br.yurekesley.appweb.resource;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.yurekesley.AppRepository;
import br.com.yurekesley.model.Produto;

@Path("/produtos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProdutoRest {
	
	@EJB
	private AppRepository repository;
	
	@GET
	public List<Produto> listar() {
		return (List<Produto>) repository.getProdutos();
	}	
}
