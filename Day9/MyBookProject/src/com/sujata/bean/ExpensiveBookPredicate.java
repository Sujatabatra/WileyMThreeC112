package com.sujata.bean;

public class ExpensiveBookPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		
		return book.getPrice()>1000;
	}

}
