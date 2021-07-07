package com.sujata.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Collection<Employee> getAllRecords() {

//		ResultSet set = connection.prepareStatement("select * from Emp").executeQuery();
//		Collection<Employee> employees;
//		employees = new ArrayList<Employee>();
//		Employee employee;
//		while (set.next()) {
//			employee = new Employee();
//			employee.seteId(set.getInt("ID"));
//			employee.seteName(set.getString("Name"));
//			employee.setDeptt(set.getString("Department"));
//			employee.setDesig(set.getString("Designation"));
//			employee.setSalary(set.getInt("Salary"));
//
//			employees.add(employee);
//		}
//		return employees;
		return null;
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
//		Connection connection = dataSource.getConnection();
//		PreparedStatement statement = connection.prepareStatement("select * from Emp where id = ?");
//		statement.setInt(1, id);
//		ResultSet set = statement.executeQuery();
//		if (set.next()) {
//			Employee employee = new Employee();
//			employee.seteId(set.getInt("ID"));
//			employee.seteName(set.getString("Name"));
//			employee.setDeptt(set.getString("Department"));
//			employee.setDesig(set.getString("Designation"));
//			employee.setSalary(set.getInt("Salary"));
//			return employee;
//		}
		return null;
	}

	@Override
	public boolean removeEmployee(int id) {

		int rows = jdbcTemplate.update("delete from Emp where id = ?", id);
		if (rows > 0)
			return true;
		return false;

	}
}