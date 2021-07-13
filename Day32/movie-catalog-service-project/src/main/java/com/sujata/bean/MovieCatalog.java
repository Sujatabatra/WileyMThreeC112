package com.sujata.bean;

public class MovieCatalog {

	private String movieName;
	private String userId;
	private int rating;
	
	public MovieCatalog() {
		
	}

	public MovieCatalog(String movieName, String userId, int rating) {
		super();
		this.movieName = movieName;
		this.userId = userId;
		this.rating = rating;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
