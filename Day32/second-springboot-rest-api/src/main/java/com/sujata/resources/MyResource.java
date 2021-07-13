package com.sujata.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {

	@RequestMapping(method = RequestMethod.GET,value = "/first",produces = "text/plain")
	public String myFirstResource() {
		return "<h1>Welcome to the world of REST API</h1>";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/second",produces = "text/html")
	public String mySecondResource() {
		return "<h1>Welcome to the world of REST API</h1>";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/third/{na}",produces = "text/html")
	public String myThirdResource(@PathVariable("na")String name) {
		return "<h1>Welcome "+name+" to the world of Spring Rest API</h1>";
	}
}
