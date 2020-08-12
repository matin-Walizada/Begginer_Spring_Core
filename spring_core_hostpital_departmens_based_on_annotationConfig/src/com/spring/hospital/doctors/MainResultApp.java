package com.spring.hospital.doctors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainResultApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		DoctorsInstructionBook theVissonDoc = context.getBean("visssionDoctor", DoctorsInstructionBook.class);

		System.out.println(theVissonDoc.checkfirstThePatients());
		System.out.println(theVissonDoc.priscribeRightMedicen());
		System.out.println(theVissonDoc.gettheAssisntanceDoct());
		
		
		VisssionDoctor vissonDoc = context.getBean("visssionDoctor", VisssionDoctor.class);

		System.out.println("======== THE Doctor Info");
		System.out.println("ID " + vissonDoc.getId());
		System.out.println("Doctors FirstName " +vissonDoc.getFirstName());
		System.out.println(vissonDoc.getLastName());
		System.out.println(vissonDoc.getEmail());
		System.out.println(vissonDoc.getCellPhone());
		
		
		System.out.println("======== THE Assistance Info");
		
		VissionAsstanceDoc theAsstanceDoc = context.getBean("vissionAsstanceDoc", VissionAsstanceDoc.class);
		
		System.out.println(theAsstanceDoc.getId());
		System.out.println(theAsstanceDoc.getFirstName());
		System.out.println(theAsstanceDoc.getLastName());
		System.out.println(theAsstanceDoc.getEmail());
		System.out.println(theAsstanceDoc.getCellPhone());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * DentalDoctor theDentalDoc = context.getBean("dentalDoctor",
		 * DentalDoctor.class);
		 * 
		 * System.out.println(theDentalDoc.checkfirstThePatients());
		 * System.out.println(theDentalDoc.priscribeRightMedicen());
		 * System.out.println(theDentalDoc.gettheAssisntanceDoct());
		 * 
		 * System.out.println("======================\n");
		 * 
		 * DoctorsInstructionBook thePdDoc = context.getBean("pdDoctor",
		 * DoctorsInstructionBook.class);
		 * 
		 * System.out.println(thePdDoc.checkfirstThePatients());
		 * System.out.println(thePdDoc.priscribeRightMedicen());
		 * System.out.println(thePdDoc.gettheAssisntanceDoct());
		 */

	}

}
