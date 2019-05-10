package br.com.yurekesley;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class App 
{
	
	@PostConstruct
    public void main( String[] args )
    {
        System.out.println( "Hello World! - APP - JMS" );
    }
}
