package com.sujata.persistence;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sujata.bean.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	

	@Transactional
	@Modifying
	@Query("update Employee set empName=:na where empId=:eid")
	void updateEmployeeName(@Param("eid") int id,@Param("na") String name);
}