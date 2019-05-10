package br.yurekesley.appweb;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ws.rs.ApplicationPath;

import br.com.yurekesley.producers.PedidoProducer;

@ApplicationPath("/")
public class AppWeb {

	@EJB
	private PedidoProducer producer;

	@PostConstruct
	public void main() {
		System.out.println("AppWeb");
	}
	
}
