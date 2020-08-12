package com.spring.hospital.doctors;

import org.springframework.context.annotation.Bean;

import com.spring.hospital.doctors.patientsInfo.DoctorsInfo;
import com.spring.hospital.doctors.patientsInfo.PatientsInfo;

public class DentalDoctor extends PatientsInfo  implements DoctorsInstructionBook {
	 
 // Dependency Injection
 
	 DoctorsInfo doctorsInfo;
	
	
 

	public DentalDoctor(int patientId, String firstName, String lastName, int age, String address) {
		super(patientId, firstName, lastName, age, address);
		 
	}

	@Override
	public String checkfirstThePatients() {
		 
		return "Let check your presure";
	}

	@Override
	public String priscribeRightMedicen() {
		 
		return "this tablet is for your teeth roots pain";
	}

	
	
	public DoctorsInfo getDoctorsInfo() {
		return doctorsInfo;
	}

	public void setDoctorsInfo(DoctorsInfo doctorsInfo) {
		this.doctorsInfo = doctorsInfo;
	}

	@Override
	public String toString() {
		return "DentalDoctor [doctorsInfo=" + doctorsInfo + ", \npatientId= " + patientId + ", firstName= " + firstName
				+ ", lastName=" + lastName + ", age= " + age + ", address=" + address + "]";
	}

 

 

 
	 
 

 
 

	 
 
	



 


	 

	
	
}
