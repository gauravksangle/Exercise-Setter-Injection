/**
 * Spring 5 Basics with Spring Boot - Exercise
 */
package com.infy.exercise.service;

import java.util.List;

import com.infy.exercise.model.EmployeeDTO;
import com.infy.exercise.repository.EmployeeRepository;
import com.infy.exercise.repository.EmployeeRepositoryImpl;

/**
 * EmployeeServiceImpl.java
 *
 * @author gaura
 */
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepositoryImpl employeeDAO = new EmployeeRepositoryImpl();

	/**
	 * @param employeeDAO
	 */
	public EmployeeServiceImpl(EmployeeRepositoryImpl employeeDAO) {
		super();
		this.employeeDAO = employeeDAO;
	}

	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the employeeDAO
	 */
	public EmployeeRepositoryImpl getEmployeeDAO() {
		return employeeDAO;
	}

	/**
	 * @param employeeDAO the employeeDAO to set
	 */
	public void setEmployeeDAO(EmployeeRepositoryImpl employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public void insert(EmployeeDTO emp) {
		employeeDAO.insertEmployee(emp);
	}

	@Override
	public void delete(int empId) {
		employeeDAO.removeEmployee(empId);
	}

	public List<EmployeeDTO> getAllCustomer() {
		return employeeDAO.fetchCustomer();
	}

}
