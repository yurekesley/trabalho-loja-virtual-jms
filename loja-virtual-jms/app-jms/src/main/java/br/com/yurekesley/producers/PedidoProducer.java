package br.com.yurekesley.producers;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

import br.com.yurekesley.model.Produto;

@Stateless
public class PedidoProducer {

	@Inject
	@JMSConnectionFactory("java:/ConnectionFactory")
	private JMSContext context;

	@Resource(mappedName = "java:/jms/queue/rQueue")
	private Queue queue;

	public void sendMessage(Produto produto) {
		this.context.createProducer().send(queue, produto);
	}
}
