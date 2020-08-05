package com.spring.hospital.doctors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainResultApp {

	public static void main(String[] args) {
		
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DoctorsInstructionBook theBook = context.getBean("dentalDoctor",DoctorsInstructionBook.class);
		
		System.out.println(theBook.checkfirstThePatients());
		System.out.println(theBook.priscribeRightMedicen());
		System.out.println(theBook.gettheAssisntanceDoct());
		
		
		System.out.println("======================\n");
		
		DoctorsInstructionBook thePdDoc = context.getBean("pdDoctor",DoctorsInstructionBook.class);
		
		System.out.println(thePdDoc.checkfirstThePatients());
		System.out.println(thePdDoc.priscribeRightMedicen());
		System.out.println(thePdDoc.gettheAssisntanceDoct());
	 
		
		

		 
	 
		
		

		 
	}

}
