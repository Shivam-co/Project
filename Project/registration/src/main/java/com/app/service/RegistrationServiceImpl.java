package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Registration;
import com.app.repository.RegistrationDao;
@Service
public class RegistrationServiceImpl implements RegistrationService {
   
	@Autowired
	RegistrationDao userDao;
	@Override
	public Registration createUser(Registration newUser) {
		Optional<Registration> findUserById = userDao.findById(newUser.getUserId());
		return userDao.save(newUser); 
	}

}
