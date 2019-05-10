package br.com.yurekesley.producers;

import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

@Startup
@Singleton
public class PedidoProducer {

	@Inject
	@JMSConnectionFactory("ConnectionFactory")
	private JMSContext context;
	
	@Resource(mappedName="java:/queue/myQueue")
	private Queue queue;

	public void sendMessage(String text) {
		this.context.createProducer().send(queue, text);
	}
}
