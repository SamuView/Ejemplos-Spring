package com.viewnext.movieadvisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.viewnext.movieadvisor.config.AppConfig;

public class MovieAdvisorApp {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MovieAdvisorRunApp runApp = appContext.getBean(MovieAdvisorRunApp.class);
		
		runApp.run(args);
		
		((AnnotationConfigApplicationContext) appContext).close();
	}

}
