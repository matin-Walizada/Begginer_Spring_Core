package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sign")
public class SignInController {
	
	
	@RequestMapping("/me")
	public String showSignInScreen() {
		
	
		return "SignInPage";
	}
	

}
