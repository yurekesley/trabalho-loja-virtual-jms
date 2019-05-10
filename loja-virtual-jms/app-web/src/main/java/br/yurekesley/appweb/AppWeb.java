package br.yurekesley.appweb;

import javax.ejb.EJB;
import javax.ws.rs.ApplicationPath;

import br.com.yurekesley.App;

@ApplicationPath("/")
public class AppWeb {
	
	@EJB 
	App app;
}
