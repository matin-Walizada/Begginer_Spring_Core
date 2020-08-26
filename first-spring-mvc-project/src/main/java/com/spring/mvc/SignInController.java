package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sign")
public class SignInController {
	
	@Autowired private  EmpService empService;

	@GetMapping("/me")
	public String showSignInScreen() {

		return "SignInPage";
	}

	@PostMapping("/welcome")
	public String showSignInScreen(HttpServletRequest req) {

		String username = req.getParameter("username");
		String password = req.getParameter("pwd");
		empService.isAuth(username, password);
		if (empService.isAuth(username, password)) {
			return "welcomepage";

		} else {
			req.setAttribute("errorMessage", "user name or password is not valide please try again");
			return "SignInPage";
		}

	}

}
