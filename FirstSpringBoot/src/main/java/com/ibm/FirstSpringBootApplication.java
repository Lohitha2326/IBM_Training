package com.ibm;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(FirstSpringBootApplication.class, args);
		
		Developer obj1=context.getBean(Developer.class);
		obj1.code();
		//System.out.println("Hello world");
	}

}
