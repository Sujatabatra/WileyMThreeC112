package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonDetails {

	List<Person> personList=new ArrayList<Person>();
	public PersonDetails() {
	personList.add(new Person(101, "AAAAA"));
	personList.add(new Person(102, "BBBBB"));
	personList.add(new Person(103, "CCCCC"));
	personList.add(new Person(104, "DDDDD"));
	personList.add(new Person(105, "EEEEE"));
	personList.add(new Person(106, "FFFFF"));
	}
	
	Person searchPersonById(int id) {
		List<Person> persons=personList.stream()
				.filter(person->person.getpId()==id)
		.collect(Collectors.toList());
		Person person=null;
		if(persons.size()>0)
			person=persons.get(0);
		
		return person;
	}
	
	Optional<Person> searchPersonByIdUsingOptional(int id) {
		List<Person> persons=personList.stream()
				.filter(person->person.getpId()==id)
		.collect(Collectors.toList());
		Person person=null;
		if(persons.size()>0)
			person=persons.get(0);
		Optional<Person> per=Optional.ofNullable(person);
		return per;
	}
}
