package com.ibm.model;

import java.sql.Date;

public class RatingsModel {
	private int userid;
	private int movieid;
	private int rating;
	private String tstamp;
	
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getTstamp() {
		return tstamp;
	}
	public void setTstamp(String tstamp) {
		this.tstamp = tstamp;
	}
	@Override
	public String toString() {
		return "RatingsModel [userid=" + userid + ", movieid=" + movieid + ", rating=" + rating + ", tstamp=" + tstamp
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	

}
