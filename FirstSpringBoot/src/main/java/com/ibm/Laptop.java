package com.ibm;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	Laptop()
	{
		System.out.println("Laptop Object created");
	}
	
	
	void compile()
	{
		System.out.println("Compiled from laptop");
	}

}
