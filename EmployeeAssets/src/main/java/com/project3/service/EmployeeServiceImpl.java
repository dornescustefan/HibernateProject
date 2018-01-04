package com.project3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project3.model.Employee;
import com.project3.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
		@Autowired
		private EmployeeRepository employeeRepository;
		
		@Transactional
		public Employee save(Employee employee) {
			return employeeRepository.save(employee);
		}
		
		public List<Employee> findAllEmployees(){
			return employeeRepository.findAll();
		}
		
		public void deleteEmployee(Long id) {
			employeeRepository.deleteById(id);
		}

		public Employee findEmployeeById(Long id) {
		    Employee employee = new Employee();
			employee = employeeRepository.getOne(id);
			return employee;
		}

}