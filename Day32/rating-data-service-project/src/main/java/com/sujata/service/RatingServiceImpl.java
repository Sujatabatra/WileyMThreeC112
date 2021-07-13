package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Rating;
import com.sujata.bean.RatingList;
import com.sujata.persistence.RatingDao;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;
	
	@Override
	public RatingList getRatingByUserId(String userId) {
		
		return new RatingList(ratingDao.findAllByUserId(userId));
		
	}

}
