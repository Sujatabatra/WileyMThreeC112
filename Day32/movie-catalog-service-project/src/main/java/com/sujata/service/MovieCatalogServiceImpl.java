package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Movie;
import com.sujata.bean.MovieCatalog;
import com.sujata.bean.Rating;
import com.sujata.bean.RatingList;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<MovieCatalog> getMovieCatalogByUserId(String userId) {
		//Call to Rating Rest API
		RatingList ratingList=restTemplate.getForObject("http://localhost:8084/ratings/"+userId, RatingList.class);
		List<MovieCatalog> movieCatalogList=new ArrayList<MovieCatalog>();
		MovieCatalog movieCatalog=null;
		for(Rating rating:ratingList.getRatings()) {
			Movie movie=restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
			movieCatalog=new MovieCatalog(movie.getMovieName(), userId, rating.getRating());
			movieCatalogList.add(movieCatalog);
		}
		return movieCatalogList;
	}

}
