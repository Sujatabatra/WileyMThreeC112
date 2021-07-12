package com.sujata.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByDepartment(String department);
	
	List<Employee> findByEmpNameOrDepartment(String empName,String department);
	
	List<Employee> findDistinctByDepartment(String department);
	
	List<Employee> findFirst3ByDepartment(String department);
}
