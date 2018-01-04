package com.project3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project3.model.Employee;
import com.project3.model.Phone;
import com.project3.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute("saveEmployeeForm")Employee employee) {
		return new ModelAndView("addEmployee", "saveEmployeeForm", employee);
	}
	
	@RequestMapping(value="/saveEmployee", method=RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("saveEmployeeForm")Employee employee) 
		{
		employeeService.save(employee);
		return new ModelAndView("redirect:/"); 
	}

	@RequestMapping(value="/viewEmployees", method=RequestMethod.GET)
	public ModelAndView viewEmployees(@ModelAttribute("phone")Phone phone) {
		    List<Employee> employeeList = employeeService.findAllEmployees();
		    return new ModelAndView( "viewEmployees", "employeeList", employeeList);
	}
	
	@RequestMapping(value="/delete{id}", method = RequestMethod.GET) 
	public ModelAndView deleteEmployee(@PathVariable Long id){
		   employeeService.deleteEmployee(id);
		   return new ModelAndView("redirect:/viewEmployees"); 
	}
	
}
