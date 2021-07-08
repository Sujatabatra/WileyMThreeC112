package com.sujata.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.bean.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.seteId(rs.getInt("ID"));
		employee.seteName(rs.getString("Name"));
		employee.setDeptt(rs.getString("Department"));
		employee.setDesig(rs.getString("Designation"));
		employee.setSalary(rs.getInt("Salary"));

		return employee;
	}

}
