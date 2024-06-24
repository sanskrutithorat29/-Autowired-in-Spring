package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;

	@Autowired
	private Department departement;// bean

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String employeeRole, double employeeSalary,
			Department departement) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
		this.departement = departement;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + ", employeeSalary=" + employeeSalary + ", departement=" + departement + "]";
	}

}
