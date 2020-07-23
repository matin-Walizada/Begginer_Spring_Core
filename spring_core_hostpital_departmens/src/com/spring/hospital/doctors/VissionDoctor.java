package com.spring.hospital.doctors;

public class VissionDoctor implements DoctorsInstructionBook {

	@Override
	public String checkfirstThePatients() {
		 
		return "let me check your eyes first";
	}

	@Override
	public String priscribeRightMedicen() {
	 
		return " you are all right, I priscribed you glasses";
	}

}
