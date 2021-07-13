package com.sujata.persistence;

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
	@Query("update Employee set empSalary=:sal where empId=:eid")
	public void updateSalary(@Param("eid") int id,@Param("sal") int salary);
}
