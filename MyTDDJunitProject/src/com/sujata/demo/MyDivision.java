package com.sujata.demo;

public class MyDivision {

	//we are allowing only division of pisitive nos, if negative no comes in then result should be zero
	//if denominator is zero then Arithmetic exception
	public int divide(int number1,int number2) {
		if(number1>0 && number2>=0)
			return number1/number2;
		else
			return 0;
	}
}
