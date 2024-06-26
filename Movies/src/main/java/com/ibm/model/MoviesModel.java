package com.ibm.model;

import org.springframework.stereotype.Component;

@Component
public class MoviesModel {
	private int movieid;
	private String title;
	private String genres;
	
	
	
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	@Override
	public String toString() {
		return "MoviesModel [movieid=" + movieid + ", title=" + title + ", genres=" + genres + "]";
	}
	
	
	
	

}
