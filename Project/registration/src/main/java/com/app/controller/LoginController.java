package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Registration;
import com.app.service.LoginService;


@RestController
public class LoginController {

	@Autowired
	private LoginService service;
	
	

	@PostMapping("/register")
	@CrossOrigin(origins="http://localhost:4200")
	public Registration registerUser(@RequestBody Registration user) throws Exception {

		String tempEmailId = user.getEmailId();
		if (tempEmailId != null && !"".equals(tempEmailId)) {
			Registration userobj = service.fetchUserByEmailId(tempEmailId);
			if (userobj != null) {
				throw new Exception("user with " + tempEmailId + " is already exist");
			}

		}

		Registration userObj = null;
		userObj = service.saveUser(user);
		return userObj;

	}
	
	@GetMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public Registration loginUser(@RequestBody Registration user) throws Exception {
		String tempEmailId=user.getEmailId();
		String tempPass = user.getPassword();
		Registration userObj = null;
		if(tempEmailId !=null && tempPass !=null) {
			userObj=service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if(userObj ==null) {
		throw new Exception("Wrong Credential")	;
		}
		return userObj;
		}

}
