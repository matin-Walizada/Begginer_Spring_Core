package com.spring.hospital.doctors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VisssionDoctor extends VissionAsstanceDoc implements DoctorsInstructionBook {

	
	@Value("${vissonDoctor.id}")
	private int id;
	@Value("${vissonDoctor.firstName}")
	private String firstName;
	@Value("${vissonDoctor.lastName}")
	private String lastName;
	@Value("${vissonDoctor.email}")
	private String email;
	@Value("${vissonDoctor.cell}")
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

	@Autowired
	@Qualifier("vissionAsstanceDoc")
	AssistanceDoctorsInstructionBook assistanceDoctorsInstructionBook;

	@Override
	public String checkfirstThePatients() {

		return "every doctor need to check the patients first";
	}

	@Override
	public String priscribeRightMedicen() {

		return "after checking all the doctors need to prescribe right medicen";
	}

	@Override
	public String gettheAssisntanceDoct() {

		return assistanceDoctorsInstructionBook.helpPatient();
	}

}
