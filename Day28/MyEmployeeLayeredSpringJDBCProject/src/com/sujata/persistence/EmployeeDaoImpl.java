package com.sujata.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private DataSource dataSource;
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Collection<Employee> getAllRecords() throws Exception{
		Connection connection = dataSource.getConnection();
		ResultSet set = connection.prepareStatement("select * from Emp").executeQuery();
		Collection<Employee> employees;
		employees = new ArrayList<Employee>();
		Employee employee;
		while(set.next()) {
			employee = new Employee();
			employee.seteId(set.getInt("ID"));
			employee.seteName(set.getString("Name"));
			employee.setDeptt(set.getString("Department"));
			employee.setDesig(set.getString("Designation"));
			employee.setSalary(set.getInt("Salary"));

			employees.add(employee);
		}
		return employees;
	}

	@Override
	public boolean insertEmployee(Employee employee) throws Exception {
		Connection connection = dataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement("insert into Emp(Id,Name,Department,Designation,Salary) values(?,?,?,?,?)");
		statement.setInt(1, employee.geteId());
		statement.setString(2,employee.geteName());
		statement.setString(3,employee.getDeptt());
		statement.setString(4,employee.getDesig());
		statement.setInt(5,employee.getSalary());
		if(statement.executeUpdate() > 0)
			return true;
		else
			return false;
	}

	@Override
	public Employee searchEmployee(int id) throws Exception{
		Connection connection = dataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement("select * from Emp where id = ?");
		statement.setInt(1, id);
		ResultSet set = statement.executeQuery();
		if(set.next()) {
			Employee employee = new Employee();
			employee.seteId(set.getInt("ID"));
			employee.seteName(set.getString("Name"));
			employee.setDeptt(set.getString("Department"));
			employee.setDesig(set.getString("Designation"));
			employee.setSalary(set.getInt("Salary"));
			return employee;
		}
		return null;
	}

	@Override
	public boolean removeEmployee(int id) throws Exception{
		Connection connection = dataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement("delete from Emp where id = ?");
		statement.setInt(1, id);
		if(statement.executeUpdate()>0)
			return true;
		else
			return false;
	}
}