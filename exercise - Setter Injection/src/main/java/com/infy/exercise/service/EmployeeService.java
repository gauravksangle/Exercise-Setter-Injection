/**
 * Spring 5 Basics with Spring Boot - Exercise
 */
package com.infy.exercise.service;

import com.infy.exercise.model.EmployeeDTO;

/**
 * EmployeeService.java
 *
 * @author gaura
 */
public interface EmployeeService {

	public void insert(EmployeeDTO emp);
	
	public void delete(int empId);
	
}
