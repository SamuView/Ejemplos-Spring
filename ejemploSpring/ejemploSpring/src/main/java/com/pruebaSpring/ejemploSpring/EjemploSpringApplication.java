package com.pruebaSpring.ejemploSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EjemploSpringApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		HolaMundo obj = (HolaMundo) context.getBean("holaMundo");
		obj.getMessage();
		
		AdiosMundo obj2 = (AdiosMundo) context.getBean("adiosMundo");
		obj2.getMessage();
		
		context.close();
	}

}
