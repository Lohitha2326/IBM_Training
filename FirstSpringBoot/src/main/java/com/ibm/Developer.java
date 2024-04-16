package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//used to create object
@Component 
public class Developer {
	public Developer()
	{
		System.out.println("Developer Object created");
	}
	
	//To access the compile method from laptop ie accessing the properties from one class to another 
	@Autowired
	Laptop lap;
	public void code()
	{
		lap.compile();
	}

}
