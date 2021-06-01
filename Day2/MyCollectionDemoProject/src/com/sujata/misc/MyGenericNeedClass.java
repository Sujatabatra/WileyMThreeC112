package com.sujata.misc;

class InputPersonDetails{
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
class InputIntegerNumber{
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}

class InputDoubleNumber{
	private double number;

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	
}

class GenericTypeValue<T>{
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
public class MyGenericNeedClass {

	public static void main(String[] args) {
		InputIntegerNumber ob1=new InputIntegerNumber();
		ob1.setNumber(10);
		System.out.println("ob1 : "+ob1.getNumber());
		
		InputDoubleNumber ob2=new InputDoubleNumber();
		ob2.setNumber(3.4);
		System.out.println("ob2 : "+ob2.getNumber());
		
		InputPersonDetails ob3=new InputPersonDetails();
		ob3.setPerson(new Person(101,"AAAA"));
		System.out.println("ob3 : "+ob3.getPerson());

		GenericTypeValue<Integer> iOb=new GenericTypeValue();
		iOb.setValue(10);
		System.out.println("iOb : "+iOb.getValue());
		
		GenericTypeValue<Person>  pOb=new GenericTypeValue();
		pOb.setValue(new Person(111, "Asha"));
		System.out.println("pOb : "+pOb.getValue());
	}

}
