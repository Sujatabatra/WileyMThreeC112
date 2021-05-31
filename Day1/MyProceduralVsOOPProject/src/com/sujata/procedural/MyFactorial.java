package com.sujata.procedural;

public class MyFactorial {

	static int number,factorial;
	
	static public void inputNumber(int n) {
		number=n;
	}
	
	static public void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	
	static public void displayFactorial() {
		System.out.println("Factiorial : "+factorial);
	}
	
	public static void main(String[] args) {
		inputNumber(5);
		calculateFactorial();
		factorial=0;
		displayFactorial();

	}

}
