package com.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee3")
public class Employee {
	
	@Id
	private int employeeId;
	private String employeeName;
	private String companyName;
	private double employeeSalary;
	private double ta;
	private double da;
	private double hra;
	private double pf;
	private double gs;
	private double ns;
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeName, String companyName, double employeeSalary, double ta,
			double da, double hra, double pf, double gs, double ns) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.companyName = companyName;
		this.employeeSalary = employeeSalary;
		this.ta = ta;
		this.da = da;
		this.hra = hra;
		this.pf = pf;
		this.gs = gs;
		this.ns = ns;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getGs() {
		return gs;
	}
	public void setGs(double gs) {
		this.gs = gs;
	}
	public double getNs() {
		return ns;
	}
	public void setNs(double ns) {
		this.ns = ns;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", companyName=" + companyName
				+ ", employeeSalary=" + employeeSalary + ", ta=" + ta + ", da=" + da + ", hra=" + hra + ", pf=" + pf
				+ ", gs=" + gs + ", ns=" + ns + "]";
	}
	
}
