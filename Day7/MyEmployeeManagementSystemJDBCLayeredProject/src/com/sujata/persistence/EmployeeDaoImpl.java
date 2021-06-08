package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.helper.MySQLConnection;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Collection<Employee> getAllRecords() throws SQLException, ClassNotFoundException {

		ArrayList<Employee> employees = null;
		Connection connection = MySQLConnection.getConnection();

		PreparedStatement statement = connection.prepareStatement("select * from emp");
		ResultSet resultset = statement.executeQuery();

		Employee employee = null;
		employees = new ArrayList<Employee>();

		while (resultset.next()) {
			employee = new Employee();
			employee.seteId(resultset.getInt("id"));
			employee.seteName(resultset.getString("name"));
			employee.setDeptt(resultset.getString("department"));
			employee.setDesig(resultset.getString("designation"));
			employee.setSalary(resultset.getInt("salary"));

			employees.add(employee);
		}

		connection.close();

		return employees;
	}

	@Override
	public boolean insertEmployee(Employee employee) throws SQLException, ClassNotFoundException {

		Connection connection = MySQLConnection.getConnection();

		PreparedStatement statement = connection.prepareStatement("insert into emp values(?,?,?,?,?)");
		statement.setInt(1, employee.geteId());
		statement.setString(2, employee.geteName());
		statement.setString(3, employee.getDeptt());
		statement.setString(4, employee.getDesig());
		statement.setInt(5, employee.getSalary());

		int rows = statement.executeUpdate();

		if (rows > 0)
			return true;

		connection.close();

		return false;

	}

}
