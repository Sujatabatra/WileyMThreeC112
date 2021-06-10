package com.sujata.bean;

import java.util.ArrayList;
import java.util.function.Predicate;

public class BookSearch {
	
	ArrayList<Book> getBooksWittenByAuthorX(ArrayList<Book> books){
		ArrayList<Book> bookList=new ArrayList<Book>();
		for(Book book:books) {
			if(book.getAuthodName().equals("Author C"))
				bookList.add(book);
		}
		
		return bookList;
	}
	
	ArrayList<Book> getThickBook(ArrayList<Book> books){
		ArrayList<Book> bookList=new ArrayList<Book>();
		for(Book book:books) {
			if(book.getNoOfPages()>1200)
				bookList.add(book);
		}
		
		return bookList;
	}
	
	ArrayList<Book> getBookAsPerBehaviour(ArrayList<Book> books,BookPredicate bookPredicate){
		ArrayList<Book> bookList=new ArrayList<Book>();
		for(Book book:books) {
			if(bookPredicate.test(book))
				bookList.add(book);
		}
		
		return bookList;
	}
	
	ArrayList<Book> getBookAsPerBehaviour2(ArrayList<Book> books,Predicate<Book> bookPredicate){
		ArrayList<Book> bookList=new ArrayList<Book>();
		for(Book book:books) {
			if(bookPredicate.test(book))
				bookList.add(book);
		}
		
		return bookList;
	}

}
