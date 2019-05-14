package br.yurekesley.appweb.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.yurekesley.model.Produto;
import br.com.yurekesley.producers.PedidoProducer;

@Path("/pedidos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PedidoRest {

	@Inject
	private PedidoProducer producer;

	@POST
	public Response adicionarProduto(Produto produto) {
		this.producer.sendMessage(produto);
		return Response.status(200).entity(produto).build();
	}
}
