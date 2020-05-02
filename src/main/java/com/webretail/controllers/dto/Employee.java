package com.webretail.controllers.dto;

public class Employee {

	private String empid;
	private String empname;
	private String email;

	public Employee(String id, String name, String email) {
		this.empid = id;
		this.empname = name;
		this.email = email;
	}
	
	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
