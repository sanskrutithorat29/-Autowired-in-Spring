package com.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

	@Bean(name = "department1")
	public Department getDepartment() {

		return new Department(101, "Data Analysis");
	}

	@Bean(name = "employee1")
	public Employee getEmployee() {

		return new Employee(1, "Sanskruti", "Sr Data Analyst", 100000.00, new Department());
	}

}
