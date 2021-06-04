package com.sujata.demo;

public enum Dish {

	CHICKEN(450,50,false),PANEER(400,60,true),FISH(400,65,false),POTATO(800,40,true),PEAS(750,50,true);
	
	
	Dish(int calorie,int quantity,boolean vegetarian) {
		this.calorie=calorie;
		this.quantity=quantity;
		this.vegetarian=vegetarian;
	}
	private boolean vegetarian;
	private int quantity, calorie;
	public boolean isVegetarian() {
		return vegetarian;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getCalorie() {
		return calorie;
	}
	
	
	
}
