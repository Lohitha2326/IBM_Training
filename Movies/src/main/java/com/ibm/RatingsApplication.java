package com.ibm;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;


import com.ibm.model.RatingsModel;

import com.ibm.service.RatingsService;

public class RatingsApplication {
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(RatingsApplication.class, args);
		
RatingsModel r=context.getBean(RatingsModel.class);
		r.setUserid(1);
		r.setMovieid(1);
		r.setRating(5);
		r.setTstamp("2023-03-18");
		
		RatingsService service=context.getBean(RatingsService.class);
		service.addRating(r);//to insert the data
		
		List<RatingsModel> all=service.getRatings();
		System.out.println(all);
	}
}
