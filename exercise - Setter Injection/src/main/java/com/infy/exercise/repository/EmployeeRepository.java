/**
 * Spring 5 Basics with Spring Boot - Exercise
 */
package com.infy.exercise.repository;

import java.util.List;

import com.infy.exercise.model.EmployeeDTO;

/**
 * EmployeeRepository.java
 *
 * @author gaura
 */
public interface EmployeeRepository {

	public void insertEmployee(EmployeeDTO emp);
	
	public void removeEmployee(int empId);
	
}
