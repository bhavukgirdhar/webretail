package com.webretail.dao.iface.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.database.hibernate.dao.impl.GenericHibernateDAOImpl;
import com.webretail.dao.iface.IEmployee;
import com.webretail.dao.pojo.Employee;

@Repository
public class EmployeeDaoImpl extends GenericHibernateDAOImpl<Employee> implements IEmployee {

	@Override
	public List<Employee> getAll() {		
		return findAll();
	}

	
}
