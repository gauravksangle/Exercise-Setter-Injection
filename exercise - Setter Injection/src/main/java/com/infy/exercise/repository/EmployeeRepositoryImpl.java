/**
 * Spring 5 Basics with Spring Boot - Exercise
 */
package com.infy.exercise.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.infy.exercise.model.EmployeeDTO;

/**
 * EmployeeRepositoryImpl.java
 *
 * @author gaura
 */
public class EmployeeRepositoryImpl implements EmployeeRepository {
	List<EmployeeDTO> employee = null;

	@PostConstruct
	public void initializer() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpId(101);
		employeeDTO.setEmpName("Jack");
		employeeDTO.setDepartment("ETA");
		employee = new ArrayList<>();
		employee.add(employeeDTO);
	}

	/**
	 * @return the employee
	 */
	public List<EmployeeDTO> getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(List<EmployeeDTO> employee) {
		this.employee = employee;
	}

	@Override
	public void insertEmployee(EmployeeDTO emp) {
		employee.add(emp);
	}

	@Override
	public void removeEmployee(int empId) {
		employee.remove(empId);
	}

	public List<EmployeeDTO> fetchCustomer() {
		return employee;
	}
}
