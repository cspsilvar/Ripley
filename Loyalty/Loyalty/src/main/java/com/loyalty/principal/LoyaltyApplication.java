package com.loyalty.principal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javadevjournal.service.DefaultHelloService;
import com.javadevjournal.service.HelloService;
import com.loyalty.bean.ResultadoProceso;
import com.loyalty.service.ITarea;
import com.loyalty.service.impl.TareaImpl;

@SpringBootApplication
public class LoyaltyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LoyaltyApplication.class, args);
	}

	
	@Bean
	public ITarea getTareaService() {
		return new TareaImpl() ;
	}
	
	
	@Bean
	public HelloService getHelloService(){
		return  new DefaultHelloService();
	}

	@Override
	public void run(String... args) throws Exception {
		//getHelloService().hello();
		ResultadoProceso resultado = getTareaService().obtenerTareas() ;
		System.out.println(resultado.getDescripcionEstado());
	}
	
}

