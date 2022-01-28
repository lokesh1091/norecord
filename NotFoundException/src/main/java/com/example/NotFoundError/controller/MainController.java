package com.example.NotFoundError.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.NotFoundError.Entity.Employee;
import com.example.NotFoundError.service.CustomerService;

@RestController
public class MainController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer/{id}")
	public Employee getCustomerById(@PathVariable int id)
	{
		return service.getUserById(id);
	}
	
	@PostMapping("customer/add")
	public Employee addCustomer()
	{
		Employee customer=new Employee("Muthuraj", "r", "muthuraj@gmail.co");
		return service.addCustomer(customer);
	}
}
