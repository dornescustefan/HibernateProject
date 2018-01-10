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
	
	//Add Employee form
	@RequestMapping(value="/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute("saveEmployeeForm")Employee employee) {
		return new ModelAndView("addEmployee", "saveEmployeeForm", employee);
	}
	
	//Save Employee data in the database
	@RequestMapping(value="/saveEmployee", method=RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("saveEmployeeForm")Employee employee) 
		{
		employeeService.save(employee);
		return new ModelAndView("redirect:/"); 
	}
	
	//List all of the Employees
	@RequestMapping(value="/viewEmployees", method = RequestMethod.GET)
	public ModelAndView viewEmployees(@ModelAttribute("phone")Phone phone) {
		    List<Employee> employeeList = employeeService.findAllEmployees();
		    return new ModelAndView( "viewEmployees", "employeeList", employeeList);
	}
	
	//Delete Employee By ID
	@RequestMapping(value="/delete{id}", method = RequestMethod.GET) 
	public ModelAndView deleteEmployee(@PathVariable Long id){
		   employeeService.deleteEmployee(id);
		   return new ModelAndView("redirect:/viewEmployees"); 
	}
	
	//Edit existing Employee after Id
	@RequestMapping(value="editEmployee{id}", method = RequestMethod.GET)
	public ModelAndView editEmployee(@PathVariable Long id) {
		Employee anEmployee = employeeService.findEmployeeById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("editEmployee");
		modelAndView.addObject("editEmployeeForm", anEmployee);
		return modelAndView;
	}
	
	//Save Edited Employee after Id
	@RequestMapping(value = "saveEditedEmployee", method = RequestMethod.POST)
	public ModelAndView saveEdit(@ModelAttribute("editEmployeeForm") Employee employee) {
		employeeService.updateEmployee(employee);
		return new ModelAndView("redirect:/viewEmployees");
	}
	
}
