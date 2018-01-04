package com.project3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project3.model.Employee;
import com.project3.model.LapTop;
import com.project3.model.Phone;
import com.project3.service.EmployeeService;

@Controller
public class AssetController {

	@Autowired
	EmployeeService employeeService;
	
	ModelAndView mv = new ModelAndView();
	@RequestMapping(value="/addPhone{id}", method = RequestMethod.GET)
	public ModelAndView addPhone(@ModelAttribute("savePhoneForm")Phone phone, @PathVariable Long id) {
		Employee employee = employeeService.findEmployeeById(id);
		mv.setViewName("addPhone");
		mv.addObject("name", employee.getName());
		mv.addObject("id", employee.getId());
		return mv;
	}
	
	@RequestMapping(value="/savePhone", method=RequestMethod.POST)
	public ModelAndView savePhone(@ModelAttribute("savePhoneForm")Phone phone, @ModelAttribute("employee")Employee employee ) 
		{
		Long id = (Long) mv.getModel().get("id");
		employee = employeeService.findEmployeeById(id);
		employee.getPhones().add(phone);
		phone.setEmployee(employee);
		employeeService.save(employee);
		return new ModelAndView("redirect:/"); 
	}
	
	
	@RequestMapping(value="/addLaptop{id}", method = RequestMethod.GET)
	public ModelAndView addLaptop(@ModelAttribute("saveLaptopForm")LapTop laptop, @PathVariable Long id) {
		Employee employee = employeeService.findEmployeeById(id);
		mv.setViewName("addLaptop");
		mv.addObject("name", employee.getName());
		mv.addObject("id", employee.getId());
		return mv;
		//return new ModelAndView("addLaptop");
	}
	
	@RequestMapping(value="/saveLaptop", method=RequestMethod.POST)
	public ModelAndView saveLaptop(@ModelAttribute("saveLaptopForm")LapTop laptop, @ModelAttribute("anemployee")Employee anemployee ) 
		{
		Long id = (Long) mv.getModel().get("id");
		anemployee = employeeService.findEmployeeById(id);
		anemployee.getLaptops().add(laptop);
		laptop.setEmployee(anemployee);
		employeeService.save(anemployee);
		return new ModelAndView("redirect:/"); 
	}
}
