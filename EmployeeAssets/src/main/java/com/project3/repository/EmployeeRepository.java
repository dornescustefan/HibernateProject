package com.project3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project3.model.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
@Modifying
@Transactional
@Query
("update com.project3.model.Employee e set e.name = ?1 where e.id = ?2")
int updateEmployee(String name, Long id);
	
}
