package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.Service.RegistrationService;
import com.webapp.entity.Registration;

@Controller
public class registrationController {
	
	@Autowired
	private RegistrationService registrationService;
	//http://localhost:8080/view-registration-page
	
	
	//Handler Method
	
	@RequestMapping("/view-registration-page")
	public String viewsRegistrationPage() {
		return "new_registration";
		
	}
	
	
	@RequestMapping("/saveReg")
	public String saveRegistration(Registration registration) {
		
		registrationService.saveRegistration(registration);
		return"new_registration";
	}
}
