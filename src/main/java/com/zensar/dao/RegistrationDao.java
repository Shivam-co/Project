package com.zensar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.model.Users;

public interface UserDao extends CrudRepository<Users,Integer>  {

}
