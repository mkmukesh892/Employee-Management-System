package com.fico.ems.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.fico.ems.model.Employee;

import com.fico.ems.service.EmployeeService;
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	
	public void createNewEmployee(@RequestBody Employee employee) {
		
			employeeService.saveEmployee(employee);
			// return "complete";
			
		}
	@RequestMapping(value="/employees" , method=RequestMethod.GET)
	public List<Employee> listOfEmployees(){
		return employeeService.getAllEmployee();
	}
	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.DELETE)
	public void deleteEmployee(@RequestBody Employee employee) {
		
			employeeService.deleteEmployee(employee);
			 
			
		}	 
	}
