package com.sujata.bean;

public class Employee {

	private int eId;
	private String eName;
	private String deptt;
	private String desig;
	private int salary;
	public Employee() {
		
	}
	public Employee(int eId, String eName, String deptt, String desig, int salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.deptt = deptt;
		this.desig = desig;
		this.salary = salary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDeptt() {
		return deptt;
	}
	public void setDeptt(String deptt) {
		this.deptt = deptt;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return eId + "\t" + eName + "\t" + deptt + "\t" + desig + "\t" + salary;
	}
}