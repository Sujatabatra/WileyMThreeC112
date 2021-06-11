package com.sujata.demo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceDemoClass {

	public static void main(String[] args) {
//		Function<String, Integer> fOb=str->{return Integer.parseInt(str);};

//		Function<String, Integer> fOb=str->Integer.parseInt(str);
		
		Function<String, Integer> fOb=Integer::parseInt;
		
		Integer iOb=fOb.apply("10");
		System.out.println("iOb : "+iOb);
		
//		
//		Consumer<String> cOb=(str)->{
//			System.out.println("Hello "+str);
//		};
		
//		Consumer<String> cOb=str->System.out.println(str);
		
		Consumer<String> cOb=System.out::println;
		
		
		cOb.accept("Kajal Srivastava");
		
//		BiFunction<String, String, Integer> bfOb=(str1,str2)->{
//			return str1.compareTo(str2);
//		};
		
//		BiFunction<String, String, Integer> bfOb=(str1,str2)->str1.compareTo(str2);
		
		BiFunction<String, String, Integer> bfOb=String::compareTo;
		
		System.out.println(bfOb.apply("Sujata", "Batra"));
		
		
	}

}
