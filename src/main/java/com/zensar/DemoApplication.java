package com.zensar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.zensar.controller.UserController;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.zensar")
//@ComponentScan(value= "com.zensar")
public class DemoApplication {
    @Autowired
	UserController Controller;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
