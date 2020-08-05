package com.spring.hospital.doctors;

import org.springframework.stereotype.Component;

@Component
public class PdAssistance implements AssistanceDoctorsInstructionBook {

	@Override
	public String helpPatient() {
		 
		return "I am pd ASSISTANCE I help with the patients when the doctor is not present";
	}

	@Override
	public void checkEachPatienBeforDoctoComes() {
		// TODO Auto-generated method stub

	}

}
