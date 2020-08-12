package com.empoyees;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("employee")
public class EmployeesService {

	@Autowired
	@Qualifier("allEmployee")
	private DataSource dataSource;

	public void saveEmployees(Employee theEmployee) {

		try {

			Connection connect = dataSource.getConnection();

			PreparedStatement theStatement = connect
					.prepareStatement("insert into myemployees " + " (id,firstName,lastName,salaary) values(?,?,?,?)");

			theStatement.setInt(1, theEmployee.getId());
			theStatement.setString(2, theEmployee.getFirstName());
			theStatement.setString(3, theEmployee.getLastName());
			theStatement.setInt(4, theEmployee.getSalaary());

			int row = theStatement.executeUpdate();

			System.out.println("the employee info is saved to the data base " + row);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("the saved employee " + theEmployee);

	}

}
