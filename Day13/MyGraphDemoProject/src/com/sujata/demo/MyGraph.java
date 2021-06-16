package com.sujata.demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MyGraph<T> {

	private Map<T, List<T>> map=new HashMap<>();
	
	public void addNewVertex(T vertex) {
		map.put(vertex, new LinkedList<T>());
	}
	
	public void addNewEdge(T sourceVertex,T destinationVertex,boolean bidirectional) {
		
		if(!map.containsKey(sourceVertex))
			addNewVertex(sourceVertex);
		
		if(!map.containsKey(destinationVertex))
			addNewVertex(destinationVertex);
		
		map.get(sourceVertex).add(destinationVertex);
		
		if(bidirectional)
			map.get(destinationVertex).add(sourceVertex);
	}
	
}
