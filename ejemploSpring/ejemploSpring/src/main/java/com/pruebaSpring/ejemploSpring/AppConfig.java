package com.pruebaSpring.ejemploSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {	
	
	@Bean
	public AdiosMundo adiosMundo() {
		AdiosMundo adiosMundo = new AdiosMundo();
		adiosMundo.setMessage("Adios mundo!");
		return adiosMundo;
	}
		
	@Bean
	@Primary
	public HolaMundo holaMundo() {
		HolaMundo holaMundo = new HolaMundo();
		holaMundo.setMessage("Hola mundo!");
		return holaMundo;
	}
}
