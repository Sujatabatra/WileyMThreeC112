package com.sujata.misc;

public class EqualsDemoClass {

	public static void main(String[] args) {
		int i=10;
		int j=10;
		if(i==j)
			System.out.println("i and j are equal");
		else 
			System.out.println("i and j are not equal");

		Person p1=new Person(111, "AAA");
		Person p2=new Person(111, "AAA");
		if(p1==p2)
			System.out.println("p1 and p2 are equal");
		else
			System.out.println("p1 and p2 are not equal");
		
		if(p1.equals(p2))
			System.out.println("p1 and p2 are equal");
		else
			System.out.println("p1 and p2 are not equal");
		
		System.out.println("p1 hashcode : "+p1.hashCode());
		System.out.println("p2 hashcode : "+p2.hashCode());
	}

}
