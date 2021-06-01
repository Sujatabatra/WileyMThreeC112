package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sujata.misc.Person;

public class MyHashSetDemoForCustomDefinedObjects {

	public static void main(String[] args) {
		
		Set<Person> mySet=new HashSet<Person>();

		mySet.add(new Person(111, "AAA"));
		mySet.add(new Person(222, "BBB"));
		mySet.add(new Person(333, "CCC"));
		mySet.add(new Person(444, "DDD"));
		
		System.out.println("Size of mySet : "+mySet.size());
		System.out.println(mySet);
		
		mySet.add(new Person(111, "AAA"));
		mySet.add(new Person(555, "EEE"));
		System.out.println("Size of mySet : "+mySet.size());
		
		mySet.remove(new Person(333, "CCC"));
		
		System.out.println("Size of mySet : "+mySet.size());
		
		System.out.println("Traversal using for each loop");
		for(Person element: mySet) {
			System.out.println(element);
		}
		System.out.println("Traversal Uaing Iterator");
		//Factory Design Pattern : because we are not creating the iterator object with new but iterator() method is creating the object for us
		Iterator<Person> iterator=mySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
