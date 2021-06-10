package com.sujata.bean;

import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) {
		ArrayList<Book> books=new ArrayList<Book>();
		books.add(new Book(101, "Book1", "Author A", 1500, 890));
		books.add(new Book(102, "Book2", "Author B", 1200, 590));
		books.add(new Book(103, "Book3", "Author C", 700, 490));
		books.add(new Book(104, "Book4", "Author D", 1050, 900));
		books.add(new Book(105, "Book5", "Author C", 1585, 8190));
		books.add(new Book(106, "Book6", "Author C", 1920, 1800));
		
		System.out.println(books);
		
		BookSearch bookSearch=new BookSearch();
		System.out.println(bookSearch.getBooksWittenByAuthorX(books));

		System.out.println("Thick Book List");
		System.out.println(bookSearch.getBookAsPerBehaviour(books, new ThickBookPredicate()));
		
		System.out.println("Expensive Book List ");
		System.out.println(bookSearch.getBookAsPerBehaviour(books, new ExpensiveBookPredicate()));
	}

}
