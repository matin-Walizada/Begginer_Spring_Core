package com.spring.hospital.doctors;

import org.springframework.stereotype.Component;

@Component
public class DentalAssistance implements AssistanceDoctorsInstructionBook {

	@Override
	public String helpPatient() {
		
		return " the Dental assistance the assistance doctor responsibility is helping the patienst when doctor is not present";
		 

	}

 
}
