package com.sujata.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyFirstStreamDemoClass {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40,50,60);
		
//		list.stream().forEach(new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		});

		list.stream().forEach(t-> System.out.println(t));
		
		System.out.println("=====================");
		list.stream().forEach(System.out::println);
	}

}
