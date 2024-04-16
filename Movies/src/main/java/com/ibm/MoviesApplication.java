package com.ibm;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ibm.model.MoviesModel;
import com.ibm.service.MovieService;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(MoviesApplication.class, args);
		
MoviesModel m=context.getBean(MoviesModel.class);
		
		m.setMovieid(2);
		m.setTitle("HI Nanna");
		m.setGenres("Emotional");
		
		MovieService service=context.getBean(MovieService.class);
		service.addMovie(m);//to insert the data
		
		List<MoviesModel> all=service.getMovies();
		System.out.println(all);
	}

}
