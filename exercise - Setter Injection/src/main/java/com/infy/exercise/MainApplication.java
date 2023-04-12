/**
 * Spring 5 Basics with Spring Boot - Exercise
 */
package com.infy.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.infy.exercise.model.EmployeeDTO;
import com.infy.exercise.service.EmployeeServiceImpl;
import com.infy.exercise.util.SpringConfiguration;

/**
 * MainApplication.java
 *
 * @author gaura
 */
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EmployeeServiceImpl service = null;
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		service = (EmployeeServiceImpl) context.getBean("employeeServiceImpl");
		
		EmployeeDTO emp = new EmployeeDTO();
		emp.setEmpId(1);
		emp.setEmpName("name");
		emp.setDepartment("deptName");
		
		System.out.println(service.getAllCustomer());
		
		service.insert(emp);
		
		System.out.println(service.getAllCustomer());
		
		service.delete(emp.getEmpId());
		
		System.out.println(service.getAllCustomer());
		
		context.close();
		
	}

}
