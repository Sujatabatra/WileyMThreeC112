package com.sujata.bean;

public class EmployeePaySlip {

	private Employee employee;
	private double hra;
	private double pf;
	private double da;
	private double totalSalary;
	
	public EmployeePaySlip() {
	
	}

	public EmployeePaySlip(Employee employee, double hra, double pf, double da, double totalSalary) {
		super();
		this.employee = employee;
		this.hra = hra;
		this.pf = pf;
		this.da = da;
		this.totalSalary = totalSalary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	@Override
	public String toString() {
		return "EmployeePaySlip [employee=" + employee + ", hra=" + hra + ", pf=" + pf + ", da=" + da + ", totalSalary="
				+ totalSalary + "]";
	}
	
	
}
