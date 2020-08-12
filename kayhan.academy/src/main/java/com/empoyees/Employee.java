package com.empoyees;

public class Employee {

	int id;
	String firstName;
	String lastName;
	int salaary;

	public Employee() {

	}

	public Employee(int id, String firstName, String lastName, int salaary) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salaary = salaary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalaary() {
		return salaary;
	}

	public void setSalaary(int salaary) {
		this.salaary = salaary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salaary=" + salaary
				+ "]";
	}
	
	

	

}
