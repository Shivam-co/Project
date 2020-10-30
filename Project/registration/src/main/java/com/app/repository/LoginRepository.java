package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Registration;

public interface LoginRepository  extends JpaRepository<Registration,Integer>{

	public Registration findByEmailId(String email);


	public Registration findByEmailIdAndPassword(String emailid, String password);

	

}
