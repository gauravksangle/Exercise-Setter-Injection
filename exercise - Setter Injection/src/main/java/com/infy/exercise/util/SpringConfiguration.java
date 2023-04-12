/**
 * Spring 5 Basics with Spring Boot - Exercise
 */
package com.infy.exercise.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.exercise.repository.EmployeeRepositoryImpl;
import com.infy.exercise.service.EmployeeServiceImpl;

/**
 * SpringConfiguration.java
 *
 * @author gaura
 */
@Configuration
public class SpringConfiguration {
	
	@Bean(name = "employeeServiceImpl")
	public EmployeeServiceImpl employeeServiceImpl() {
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		
		employeeServiceImpl.setEmployeeDAO(employeeRepositoryImpl());
		
		return employeeServiceImpl;
	}
	
	@Bean
	public EmployeeRepositoryImpl employeeRepositoryImpl() {
		return new EmployeeRepositoryImpl();
	}
}
