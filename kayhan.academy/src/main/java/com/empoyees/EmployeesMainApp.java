package com.empoyees;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeesMainApp {

	
	
	
	public static void main(String[] args) {
	 

		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeesDataResouce.xml");
		
		EmployeesService theEmployeesService = (EmployeesService) context.getBean("employee");
		
		
		Employee theEmployee = new Employee();
		theEmployee.setId(3);
		theEmployee.setFirstName("friba");
		theEmployee.setLastName("Haris");
		theEmployee.setSalaary(3000);
		
		theEmployeesService.saveEmployees(theEmployee);
		
		
	}

}
