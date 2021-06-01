package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> mySet=new TreeSet<Integer>();

		mySet.add(10);
		mySet.add(34);
		mySet.add(30);
		mySet.add(40);
		
		System.out.println("Size of mySet : "+mySet.size());
		System.out.println(mySet);
		
		mySet.add(78);
		mySet.add(20);
		mySet.add(90);
		System.out.println("Size of mySet : "+mySet.size());
		
		mySet.remove(30);
		
		System.out.println("Size of mySet : "+mySet.size());
		
		System.out.println("Traversal using for each loop");
		for(Integer element: mySet) {
			System.out.println(element);
		}
		System.out.println("Traversal Uaing Iterator");
		//Factory Design Pattern : because we are not creating the iterator object with new but iterator() method is creating the object for us
		Iterator<Integer> iterator=mySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
