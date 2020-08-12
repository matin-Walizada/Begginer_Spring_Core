package com.spring.hospital.doctors.patientsInfo;

public class DoctorsInfo {

	int Id;
	String firstName;
	String lastName;
	String specilaities;
	int contact;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getSpecilaities() {
		return specilaities;
	}

	public void setSpecilaities(String specilaities) {
		this.specilaities = specilaities;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return " [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", specilaities="
				+ specilaities + ", contact=" + contact + "]";
	}

 
	
	
	
}
