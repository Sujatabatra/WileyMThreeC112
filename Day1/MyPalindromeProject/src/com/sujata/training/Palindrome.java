package com.sujata.training;

import com.sujata.demo.Reverse;

public class Palindrome {

	private int number;
	private boolean palindorme;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isPalindorme() {
		Reverse reverse=new Reverse();
		reverse.setNumber(number);
		if(number==reverse.getReverseNumber())
			palindorme=true;
		return palindorme;
	}
	
}
