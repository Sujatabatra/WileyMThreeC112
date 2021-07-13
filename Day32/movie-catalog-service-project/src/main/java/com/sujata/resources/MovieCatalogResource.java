package com.sujata.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.MovieCatalog;
import com.sujata.service.MovieCatalogService;

@RestController
public class MovieCatalogResource {

	@Autowired
	MovieCatalogService movieCatalogService;
	
	@GetMapping(path = "/catalogs/{uid}",produces = "application/json")
	public List<MovieCatalog> getMovieCatalogByUserId(@PathVariable("uid") String uid){
		return movieCatalogService.getMovieCatalogByUserId(uid); 
	}
}
