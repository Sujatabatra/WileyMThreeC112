package com.sujata.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;
import com.sujata.helper.EmployeeRowMapper;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Collection<Employee> getAllRecords() {

		List<Employee> employees = jdbcTemplate.query("select * from Emp", new EmployeeRowMapper());
		return employees;
	}

	@Override
	public boolean insertEmployee(Employee employee) {

		int rows = jdbcTemplate.update("insert into Emp(Id,Name,Department,Designation,Salary) values(?,?,?,?,?)",
				employee.geteId(), employee.geteName(), employee.getDeptt(), employee.getDesig(), employee.getSalary());
		if (rows > 0)
			return true;
		return false;

	}

	@Override
	public Employee searchEmployee(int id) {
		Object ob[] = { id };
		Employee employee = jdbcTemplate.queryForObject("select * from Emp where id = ?", ob, new EmployeeRowMapper());
		return employee;
	}

	@Override
	public boolean removeEmployee(int id) {

		int rows = jdbcTemplate.update("delete from Emp where id = ?", id);
		if (rows > 0)
			return true;
		return false;

	}
}