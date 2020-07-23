package com.spring.hospital.doctors;

public class PediatricsDoctor implements DoctorsInstructionBook {

	@Override
	public String checkfirstThePatients() {
		 
		return "I am chicking the babys presure";
	}

	@Override
	public String priscribeRightMedicen() {
	 
		return "this medicen is for babys favore";
	}

}
