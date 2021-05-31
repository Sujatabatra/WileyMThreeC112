package com.sujata.oop;

/*
 * Encapsulation : class
 * Data Hiding : provate access specifier
 * Data Abstraction : Methods
 */
public class Factorial {
	//Modifiable access : setter
	//Readable Access : getter
	//modifiable access : number
	//readable access : factorial
	private int number,factorial;


	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
		return factorial;
	}


}
