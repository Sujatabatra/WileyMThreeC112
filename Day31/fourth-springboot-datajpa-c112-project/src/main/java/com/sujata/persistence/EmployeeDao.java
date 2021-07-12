package com.sujata.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	//Named Parameters
	@Query("select empName from Employee where empId=:eid")
	String findNameById(@Param("eid") int id);
	
	@Query("from Employee where department=:dept")
	List<Employee> findAllEmployeesByDepartment(@Param("dept") String deptt);

//	@Query("from Employee where empName=:na and department=:dep")
//	List<Employee> findByNameAndDepartment(@Param("dep") String deptt,@Param("na") String name);
	
	//Positional Parameters
	@Query("from Employee where empName=?1 and department=?2")
	List<Employee> findByNameAndDepartment(String name,String deptt);
	
	@Query(value="select empName from JPAEmployee where employeeId=:eid",nativeQuery=true)
	String findNameByIdNative(@Param("eid") int id);
}
