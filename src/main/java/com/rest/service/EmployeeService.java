package com.rest.service;

import java.util.List;

import com.rest.entity.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	public Employee getOne(Integer employeeId);
	public List<Employee> getAll();
	public void deleteEmployee(Integer employeeId);
	
	public Employee updateGetRecord(Integer employeeId);
	public Employee updateEmployee(Employee old , Employee employee);
	

	
	

}
