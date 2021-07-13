package com.sujata.service;

import java.util.List;

import com.sujata.bean.MovieCatalog;

public interface MovieCatalogService {

	List<MovieCatalog> getMovieCatalogByUserId(String userId);
}
