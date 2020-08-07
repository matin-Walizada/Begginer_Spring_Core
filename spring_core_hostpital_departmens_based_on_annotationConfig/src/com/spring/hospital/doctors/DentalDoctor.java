package com.spring.hospital.doctors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DentalDoctor implements DoctorsInstructionBook {
		
 
	 

	// dependency injection

	@Autowired
	@Qualifier("dentalAssistance")
	private AssistanceDoctorsInstructionBook assistanceDoctorsInstructionBook;

 

	@Override
	public String checkfirstThePatients() {

		return "Let check your presure";
	}

	@Override
	public String priscribeRightMedicen() {

		return "this tablet is for your teeth roots pain";
	}

	@Override
	public String gettheAssisntanceDoct() {

		return assistanceDoctorsInstructionBook.helpPatient();
	}

 
	
	
	

}
