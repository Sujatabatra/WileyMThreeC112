package com.sujata.demo;

public class MyDishMain {

	public static void main(String[] args) {
		Dish dish=Dish.FISH;
		
		System.out.println("Vegetarian status :"+dish.isVegetarian());
		System.out.println("Calories : "+dish.getCalorie());
		System.out.println("Quantity : "+dish.getQuantity()+" ounces ");
		

		
	}

}
