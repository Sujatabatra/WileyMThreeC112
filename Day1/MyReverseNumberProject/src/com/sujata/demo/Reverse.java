package com.sujata.demo;

public class Reverse {

	private int number,reverseNumber;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getReverseNumber() {
		calculateReverse();
		return reverseNumber;
	}
	
	private void calculateReverse() {
		reverseNumber=0;
		int remainder;
		while(number!=0) {
			remainder=number%10;
			reverseNumber=reverseNumber*10+remainder;
			number=number/10;
		}
	}

		
}
