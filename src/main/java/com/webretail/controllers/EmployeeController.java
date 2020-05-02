package com.webretail.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webretail.controllers.dto.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping("/get-all-employees")
	public Employee greeting() {
		return new Employee("1", "Bhavuk", "bhavukgirdher@gmail.com");
	}
}
