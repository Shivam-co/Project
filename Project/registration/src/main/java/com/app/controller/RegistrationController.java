package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Registration;
import com.app.service.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	private RegistrationService userService;

	@PostMapping("/createUser")
	@ResponseBody
	@CrossOrigin("http://localhost:4200")
	//@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addUser(@RequestBody Registration newUser) {

		userService.createUser(newUser);
	}


}