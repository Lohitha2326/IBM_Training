package com.ibm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@GetMapping("/")
	public String home()
	{
		return "Welcome to Home page";
	}

}
