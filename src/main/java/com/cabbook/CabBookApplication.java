package com.cabbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CabBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabBookApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.refresh();
	}

}
