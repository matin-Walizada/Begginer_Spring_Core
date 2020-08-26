package com.spring.mvc.products.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SigInController {

	
	@GetMapping({"/takeMetoSignInPage", "/"})
	public String showSignInPage() {
		
		
		return "signInScreen";
	}
	
	
	
	@PostMapping("/signIn")
	public String ShowWecomeScreen(HttpServletRequest req) {
		String userName = req.getParameter("username");
		String password = req.getParameter("pwd");
		if("kamal".equals(userName) && "abc".equals(password)){
			return "WelcomeScreen";
		}else {
			req.setAttribute("errorMessage", "the username or password is incorect please try again");
		return "signInScreen";
		}
	}
	
	
	
	
	
	
	
	
	
	
}
