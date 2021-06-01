package com.sujata.mapdemo;

import java.util.HashMap;
import java.util.Set;

public class MyHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> months=new HashMap<String, Integer>();
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		
		System.out.println(months);
		months.put("Feb", 29);
		System.out.println(months);
		
		Set<String> monthsName=months.keySet();
		for(String name:monthsName) {
			System.out.println("Total No of days in "+name+" is "+months.get(name));
		}

	}

}
