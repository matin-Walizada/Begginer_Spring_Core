package com.spring.hospital.doctors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VissionAsstanceDoc implements AssistanceDoctorsInstructionBook {

	
	@Value("${visssonAssistance.id}")
	private int id;
	@Value("${visssonAssistance.firstName}")
	private String firstName;
	@Value("${visssonAssistance.lastName}")
	private String lastName;
	@Value("${visssonAssistance.email}")
	private String email;
	@Value("${visssonAssistance.cell}")
	private String cellPhone;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	@Override
	public String helpPatient() {

		return "the Vission Assistance doctor need to check the patients when the Visson doctor is not present or comming late";
	}

}
