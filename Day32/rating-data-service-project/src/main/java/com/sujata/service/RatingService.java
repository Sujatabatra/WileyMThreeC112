package com.sujata.service;

import java.util.List;

import com.sujata.bean.Rating;
import com.sujata.bean.RatingList;

public interface RatingService {
	
	RatingList getRatingByUserId(String userId);

}
