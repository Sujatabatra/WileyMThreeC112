package com.sujata.bean;

import java.util.List;

public class RatingList {

	private List<Rating> ratings;
	
	public RatingList() {
		
	}

	public RatingList(List<Rating> ratings) {
		super();
		this.ratings = ratings;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
	
}
