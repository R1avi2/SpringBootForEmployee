package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Employee;
import com.rest.repository.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		double sal=0.0;
		double TA=0.0;
		double DA=0.0;
		double HRA=0.0;
		double PF=0.0;
		double GS=0.0;
		double NT=0.0;
		
		sal=employee.getEmployeeSalary();
		
		if(sal<30000)
		{
			TA=(sal*7)/100;
			DA=(sal*9)/100;
			HRA=(sal*11)/100;
			PF=(sal*15)/100;
		}
		else if(sal>=30000 && sal<50000)
		{
			TA=(sal*12)/100;
			DA=(sal*13)/100;
			HRA=(sal*17)/100;
			PF=(sal*22)/100;
		}
		else
		{
			TA=(sal*17)/100;
			DA=(sal*19)/100;
			HRA=(sal*21)/100;
			PF=(sal*25)/100;
		}
		
		GS=TA+DA+HRA+sal;
		
		NT=GS-PF;
		
		employee.setTa(TA);
		employee.setDa(DA);
		employee.setHra(HRA);
		employee.setPf(PF);
		employee.setGs(GS);
		employee.setNs(NT);
		
		Employee e=empRepo.save(employee);
		

		
		return e;
	}

	@Override
	public Employee getOne(Integer employeeId) {
	Employee e=	empRepo.findById(employeeId).get();
		return e;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> e=	empRepo.findAll();
		return e;
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		empRepo.deleteById(employeeId);

	}

	@Override
	public Employee updateGetRecord(Integer employeeId) {
		Employee e= empRepo.findById(employeeId).get();
		return e;
	}

	@Override
	public Employee updateEmployee(Employee old, Employee employee) {
		
		old.setEmployeeName(employee.getEmployeeName());
		old.setCompanyName(employee.getCompanyName());
		old.setEmployeeSalary(employee.getEmployeeSalary());
		

		double sal=0.0;
		double TA=0.0;
		double DA=0.0;
		double HRA=0.0;
		double PF=0.0;
		double GS=0.0;
		double NT=0.0;
		
		sal=old.getEmployeeSalary();
		
		if(sal<30000)
		{
			TA=(sal*7)/100;
			DA=(sal*9)/100;
			HRA=(sal*11)/100;
			PF=(sal*15)/100;
		}
		else if(sal>=30000 && sal<50000)
		{
			TA=(sal*12)/100;
			DA=(sal*13)/100;
			HRA=(sal*17)/100;
			PF=(sal*22)/100;
		}
		else
		{
			TA=(sal*17)/100;
			DA=(sal*19)/100;
			HRA=(sal*21)/100;
			PF=(sal*25)/100;
		}
		
		GS=TA+DA+HRA+sal;
		
		NT=GS-PF;
		
		old.setTa(TA);
		old.setDa(DA);
		old.setHra(HRA);
		old.setPf(PF);
		old.setGs(GS);
		old.setNs(NT);
		
		Employee e=empRepo.save(old);
		

		
		return e;
	}

	

	
}
