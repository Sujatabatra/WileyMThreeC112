package com.sujata.persistence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	Collection<Employee> getAllRecords() throws SQLException, ClassNotFoundException,ClassNotFoundException, IOException;
	boolean insertEmployee(Employee employee) throws SQLException, ClassNotFoundException,ClassNotFoundException, IOException;
}
