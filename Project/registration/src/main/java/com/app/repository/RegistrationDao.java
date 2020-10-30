package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.model.Registration;

public interface RegistrationDao extends CrudRepository<Registration,Integer>  {

}
