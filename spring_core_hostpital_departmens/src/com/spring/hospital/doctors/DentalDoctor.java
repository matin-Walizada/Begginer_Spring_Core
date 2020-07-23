package com.spring.hospital.doctors;

public class DentalDoctor implements DoctorsInstructionBook {

	int id;
	String firstName;
	String lastName;
	int cellPhone;
	
	
	@Override
	public String checkfirstThePatients() {
		 
		return "Let check your presure";
	}

	@Override
	public String priscribeRightMedicen() {
		 
		return "this tablet is for your teeth roots pain";
	}

}
