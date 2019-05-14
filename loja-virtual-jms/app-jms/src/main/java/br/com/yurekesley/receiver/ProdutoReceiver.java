package br.com.yurekesley.receiver;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import br.com.yurekesley.model.Produto;
import br.com.yurekesley.service.PedidoService;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destinationLoookup", propertyValue = "java:/jms/queue/rQueue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/queue/rQueue") })
public class ProdutoReceiver implements MessageListener {

	@EJB
	private PedidoService service;

	public void onMessage(Message message) {

		ObjectMessage objectMessage = (ObjectMessage) message;

		try {
			Produto produto = (Produto) objectMessage.getObject();
			this.service.adicionarProdutoNoPedido(produto);

		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
