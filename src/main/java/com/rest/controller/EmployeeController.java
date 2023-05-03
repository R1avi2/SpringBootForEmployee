package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Employee;
import com.rest.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee)
	{
		Employee e=	empService.saveEmployee(employee);
		return e;
		
	}
	
	@GetMapping("/get/{employeeId}")
	public Employee getEmployee(@PathVariable Integer employeeId)
	{
		Employee e=empService.getOne(employeeId);
		return e;
		
	}
	
	
	@GetMapping("/getAll")
	public List<Employee> getEmployees()
	{
		List<Employee> e=empService.getAll();
		return e;
		
	}
	
	@DeleteMapping("/delete/{employeeId}")
	public void deleteEmp(@PathVariable Integer employeeId )
	{
		empService.deleteEmployee(employeeId);
	}
	
	
	@PutMapping("/update/{employeeId}")
	public Employee updateemp(@PathVariable Integer employeeId,@RequestBody Employee employee)
	{
		Employee emp=empService.updateGetRecord(employeeId);
		
	    Employee e=	empService.updateEmployee(emp, employee);
	    
		return e;
		
	}

}
