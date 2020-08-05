package com.spring.hospital.doctors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PdDoctor implements DoctorsInstructionBook {

	@Autowired
	@Qualifier("pdAssistance")
	AssistanceDoctorsInstructionBook assistanceDoctorsInstructionBook;
	
	
	@Override
	public String checkfirstThePatients() {
		 
		return "ALWASY CHECK THE KIDS FAVOR";
	}

	@Override
	public String priscribeRightMedicen() {
	 
		return "THE TABLET is for your head PAIN";
	}

	@Override
	public String gettheAssisntanceDoct() {
		 
		return assistanceDoctorsInstructionBook.helpPatient();
	}

}
