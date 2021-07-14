package com.sujata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JPAEmployee")
public class Employee {
	@Id
	@Column(name = "employeeId")
	private Integer empId;
	private String empName;
	@Column(name = "deptt")
	private String department;
	private String designation;
	private int empSalary;

	public Employee() {

	}

	public Employee(Integer empId, String empName, String department, String designation, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.designation = designation;
		this.empSalary = empSalary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
}