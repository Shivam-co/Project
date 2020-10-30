package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Registration;

import com.app.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository repo;
	public Registration saveUser(Registration user) {	
	return	repo.save(user);
		
	}
	
	public Registration fetchUserByEmailId(String email) {
		 return repo.findByEmailId(email);
		
	}
	
	public Registration fetchUserByEmailIdAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return repo.findByEmailIdAndPassword(email,password);
	}
}
