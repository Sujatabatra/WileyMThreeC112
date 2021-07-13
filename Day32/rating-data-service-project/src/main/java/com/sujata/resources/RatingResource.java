package com.sujata.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.RatingList;
import com.sujata.service.RatingService;

@RestController
public class RatingResource {
	@Autowired
	private RatingService ratingService;
	
	@GetMapping(path = "/ratings/{uid}",produces = "application/json")
	public RatingList getRatingsByUserId(@PathVariable("uid") String userId) {
		return ratingService.getRatingByUserId(userId);
	}

}
