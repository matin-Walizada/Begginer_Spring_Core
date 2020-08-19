package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my")
public class BookingController {

	
	@RequestMapping("/booking")
	public String showBookingPage() {
		
		
		
		return  "booking";
		
	}
	
}
