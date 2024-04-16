package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.MoviesModel;
import com.ibm.repo.MoviesRepository;

@Service
public class MovieService {
	
	@Autowired
	
	MoviesRepository repo;
	
	public void addMovie(MoviesModel m)
	{
		repo.save(m);
		
	}
	
	public List<MoviesModel> getMovies()
	{
		return repo.getAll();
	}
	

}
