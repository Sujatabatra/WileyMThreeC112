package com.sujata.setdemos;

import java.util.Comparator;

public class SortByPrice implements Comparator<MyBook> {

	@Override
	public int compare(MyBook book1, MyBook book2) {
		if(book1.getPrice()>book2.getPrice())
			return 1;
		else if(book1.getPrice()<book2.getPrice())
			return -1;
		return 0;
	}

}
