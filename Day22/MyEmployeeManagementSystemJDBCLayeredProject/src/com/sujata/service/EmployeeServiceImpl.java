package com.sujata.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePaySlip;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public Collection<Employee> getAllEmployees()throws SQLException, ClassNotFoundException,ClassNotFoundException, IOException {
		
		return employeeDao.getAllRecords();
	}

	@Override
	public boolean saveEmployee(Employee employee) throws SQLException, ClassNotFoundException,ClassNotFoundException, IOException{
		return employeeDao.insertEmployee(employee);
	}


	/*
	 * employee id,employee name,department, designation,basic salary,hra:10%of basic
	 * pf=12% of basic, da=8% of basic
	 */
	@Override
	public EmployeePaySlip getPaySlip(int eid) throws SQLException, ClassNotFoundException,ClassNotFoundException, IOException{
		
		Employee employee=employeeDao.getRecordByID(eid);
		
		EmployeePaySlip paySlip=null;
		if(employee!=null) {
			paySlip=new EmployeePaySlip();
			paySlip.setEmployee(employee);
			paySlip.setDa(.08*employee.getSalary());
			paySlip.setHra(.1*employee.getSalary());
			paySlip.setPf(.12*employee.getSalary());
			paySlip.setTotalSalary(paySlip.getEmployee().getSalary()+paySlip.getDa()+paySlip.getHra()-paySlip.getPf());
			
		}
		return paySlip;
	}

	
}
