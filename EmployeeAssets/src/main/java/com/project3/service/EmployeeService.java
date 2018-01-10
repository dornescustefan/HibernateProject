package com.project3.service;

import java.util.List;

import com.project3.model.Employee;

public interface EmployeeService {
	
	void deleteEmployee(Long id);
	List<Employee> findAllEmployees();
    Employee findEmployeeById(Long id);
    Employee save(Employee employee);
	void updateEmployee(Employee employee);
}
