package com.spring.hospital.doctors;

public class PediatricsDoctor extends PatientsInfo implements DoctorsInstructionBook {

			//dependency injection
			DoctorsInfo doctorsInfo;
	
	
	
	public PediatricsDoctor(int patientId, String firstName, String lastName, int age, String address) {
		super(patientId, firstName, lastName, age, address);
	
	}

	@Override
	public String checkfirstThePatients() {
		 
		return "I am chicking the babys presure";
	}

	@Override
	public String priscribeRightMedicen() {
	 
		return "this medicen is for babys favore";
	}

	public DoctorsInfo getDoctorsInfo() {
		return doctorsInfo;
	}

	public void setDoctorsInfo(DoctorsInfo doctorsInfo) {
		this.doctorsInfo = doctorsInfo;
	}

	public String getDoctorInfo() {
		
		
		return doctorsInfo.getSpecilaities();
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "PediatricsDoctor [doctorsInfo=" + doctorsInfo + ", \npatientId=" + patientId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
	
	

}
