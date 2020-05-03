package com.webretail.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webretail.dao.iface.IEmployee;
import com.webretail.dao.pojo.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	IEmployee empDao;
	
	
	@GetMapping("/get-all-employees")
	public List<Employee> greeting() {
		return empDao.getAll();
	}
}
