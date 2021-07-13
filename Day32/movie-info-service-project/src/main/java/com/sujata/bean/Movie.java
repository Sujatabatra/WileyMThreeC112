package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	private String movieId;
	private String movieName;

	public Movie() {

	}

	public Movie(String movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
