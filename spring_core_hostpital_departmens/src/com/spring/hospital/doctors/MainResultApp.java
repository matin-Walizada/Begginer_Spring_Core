package com.spring.hospital.doctors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainResultApp {

	public static void main(String[] args) {
		
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		DoctorsInstructionBook theVison = context.getBean("Vission", DoctorsInstructionBook.class);
		
		System.out.println(theVison.checkfirstThePatients());
		System.out.println(theVison.priscribeRightMedicen());
		

		System.out.println("=========================\n");
		DoctorsInstructionBook theDental = context.getBean("dental", DoctorsInstructionBook.class);
		
		System.out.println(theDental.checkfirstThePatients());
		System.out.println(theDental.priscribeRightMedicen());
		System.out.println(theDental);
		
		
		System.out.println("=========================\n");
		DoctorsInstructionBook thepeiatrics = context.getBean("Pd", DoctorsInstructionBook.class);
		
		System.out.println(thepeiatrics.checkfirstThePatients());
		System.out.println(thepeiatrics.priscribeRightMedicen());
		System.out.println(thepeiatrics);
		
		 PediatricsDoctor theDoctor = context.getBean("Pd",PediatricsDoctor.class);
		 
		 System.out.println(" this is Pd DOC SPECIALITIS "+ theDoctor.getDoctorInfo());
		 
	}

}
