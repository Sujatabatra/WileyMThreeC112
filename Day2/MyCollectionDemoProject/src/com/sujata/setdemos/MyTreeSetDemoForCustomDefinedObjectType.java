package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSetDemoForCustomDefinedObjectType {

	public static void main(String[] args) {
		
		Set<Book> mySet=new TreeSet<Book>();

		mySet.add(new Book(101, "Book1", "Author A", 780, 800));
		mySet.add(new Book(102, "Book2", "Author B", 810, 900));
		mySet.add(new Book(103, "Book3", "Author C", 7800, 1800));
		mySet.add(new Book(104, "Book4", "Author D", 1000, 1200));
		
		System.out.println("Size of mySet : "+mySet.size());
		System.out.println(mySet);
		
		mySet.add(new Book(101, "Book1", "Author A", 780, 800));
		mySet.add(new Book(105, "Book5", "Author E", 900, 8100));
		mySet.add(new Book(106, "Book6", "Author F", 340, 700));
		System.out.println("Size of mySet : "+mySet.size());
		
	
		
	
		
		System.out.println("Traversal using for each loop");
		for(Book element: mySet) {
			System.out.println(element);
		}
		System.out.println("Traversal Uaing Iterator");
		//Factory Design Pattern : because we are not creating the iterator object with new but iterator() method is creating the object for us
		Iterator<Book> iterator=mySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
