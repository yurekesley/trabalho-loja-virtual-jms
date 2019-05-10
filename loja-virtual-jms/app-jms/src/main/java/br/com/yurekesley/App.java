package br.com.yurekesley;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class App 
{
	
	@PostConstruct
    public void main()
    {
    //    this.pedidoProducer.sendMessage("Yure Kesley");
    }
}
