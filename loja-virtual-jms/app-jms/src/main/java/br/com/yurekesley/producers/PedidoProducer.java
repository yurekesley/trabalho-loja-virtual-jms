package br.com.yurekesley.producers;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

@Stateless
public class PedidoProducer {

	@Inject
	@JMSConnectionFactory("java:/ConnectionFactory")
	private JMSContext context;

    @Resource(mappedName = "java:/jms/queue/rQueue")  
	private Queue queue;

	public void sendMessage(String text) {

		this.context.createProducer().send(queue, text);

	}
}
