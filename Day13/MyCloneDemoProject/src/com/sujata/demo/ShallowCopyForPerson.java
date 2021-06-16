package com.sujata.demo;

public class ShallowCopyForPerson {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person per=new Person("P001", "Bharti", new Address(101, "Street1", "Delhi", "Delhi"));
		
		Person clonedPer=(Person)per.clone();
		
		System.out.println(per);
		System.out.println(clonedPer);
		System.out.println("===========================");
		System.out.println(per.hashCode());
		System.out.println(clonedPer.hashCode());
		System.out.println("================================");
		System.out.println("per address: "+per.getAddr().hashCode());
		System.out.println("cloned per address : "+clonedPer.getAddr().hashCode());
		System.out.println("=====================================");
		per.setpName("Deepika");
		System.out.println(per);
		System.out.println(clonedPer);
		
		System.out.println("===============================");
		per.getAddr().sethNo(999);
		System.out.println(per);
		System.out.println(clonedPer);
		
	}

}
