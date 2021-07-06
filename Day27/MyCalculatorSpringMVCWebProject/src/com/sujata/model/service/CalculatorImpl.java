package com.sujata.model.service;

import org.springframework.stereotype.Service;

import com.sujata.bean.Numbers;

@Service
public class CalculatorImpl implements Calculator {

	@Override
	public int sum(Numbers numbers) {
		return numbers.getNumber1()+numbers.getNumber2();
	}

	@Override
	public int difference(Numbers numbers) {
		
		return numbers.getNumber1()-numbers.getNumber2();
	}

	@Override
	public int product(Numbers numbers) {
		return numbers.getNumber1()*numbers.getNumber2();
	}

	@Override
	public int division(Numbers numbers) {
		return numbers.getNumber1()/numbers.getNumber2();
	}

}
