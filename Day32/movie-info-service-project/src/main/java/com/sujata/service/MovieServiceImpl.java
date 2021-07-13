package com.sujata.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Movie;
import com.sujata.persistence.MovieDao;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;
	
	@Override
	public Movie searchById(String mId) {
		Optional<Movie> opMovie=movieDao.findById(mId);
		Movie movie=null;
		if(opMovie.isPresent())
			movie=opMovie.get();
		return movie;
	}

}
