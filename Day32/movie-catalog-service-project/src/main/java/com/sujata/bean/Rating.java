package com.sujata.bean;


public class Rating {

	
	private int ratingId;
	private String userId;
	private String movieId;
	private int rating;
	
	public Rating() {
		
	}

	public Rating(int ratingId, String userId, String movieId, int rating) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
	}

	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
