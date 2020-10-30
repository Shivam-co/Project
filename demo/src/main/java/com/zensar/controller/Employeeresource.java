package com.zensar.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.model.Employee;
@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http:/localhost:4200/")
public class Employeeresource {

	public List<Employee> employees=new ArrayList<>();
	
	public Employeeresource() {
		employees.add(new Employee(101,"ram",1));
		employees.add(new Employee(102,"raju",10));
		employees.add(new Employee(103,"ravi",100));
		employees.add(new Employee(104,"raman",1000));
		employees.add(new Employee(105,"rancho",10000));
		
	}
			
			/*Arrays.asList(
			
			new Employee(101,"ram",100),
			new Employee(102,"ram",100),
			new Employee(103,"ram",100),
			new Employee(104,"ram",100),
			new Employee(105,"ram",100)
			);*/
	
	@GetMapping(value="/employees")
	public List<Employee> getallEmployees(){
		return employees;
	}
	
	@PostMapping(value="/employee")
	public void insertEmployee(@RequestBody Employee employee) {
		employees.add(employee);
	}
}
