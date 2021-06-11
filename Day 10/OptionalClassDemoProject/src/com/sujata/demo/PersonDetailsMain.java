package com.sujata.demo;

import java.util.Optional;
import java.util.Scanner;

public class PersonDetailsMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Person ID whoes Record you want to search");
		int id=sc.nextInt();
		
		PersonDetails pd=new PersonDetails();
//		Person p=pd.searchPersonById(id);
//		System.out.println(p.getpId()+"  "+p.getpName());
		
		Optional<Person> person=pd.searchPersonByIdUsingOptional(id);
		person.ifPresent(pers->{
			System.out.println(pers);
		});
		
		Person per=person.orElse(new Person(0,"Dummy"));
		System.out.println(per);
	

	}

}
