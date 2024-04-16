package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.MoviesModel;
import com.ibm.model.RatingsModel;
import com.ibm.repo.RatingsRepository;

@Service
public class RatingsService {
	
	@Autowired
	
	RatingsRepository repo;
	public void addRating(RatingsModel r)
	{
		repo.saveRatings(r);
	}
	
	public List<RatingsModel> getRatings()
	{
		return repo.getAll();
	}
	

}
