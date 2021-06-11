package com.sujata.demo;

import java.util.Arrays;
import java.util.List;

public class MySecondStreamDemoClass {

	public static void main(String[] args) {
		List<Integer> elementList=Arrays.asList(111,22,33,22,56,67,78,56);
		
		elementList.stream()
		.filter((arg)->{	
		return (arg%2==0);
		})
		.distinct()
		.forEach(System.out::println);
		System.out.println("=====================");
		elementList.stream()
		.filter(arg->arg%2==0)   //intermediate
		.map(arg->arg*arg) //intermediate
		.limit(2)
		.forEach(System.out::println); //end
		
		System.out.println(elementList);
		
		long count=elementList.stream()
		.filter(arg->arg%2==0)
		.count();
		System.out.println("Total no of even Nos : "+count);

	}

}
