package com.example.NotFoundError.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NotFoundError.Entity.Employee;
import com.example.NotFoundError.ExceptionHandle.ResourceNotFoundException;
import com.example.NotFoundError.Repo.CustomerRepository;



@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public Employee getUserById(int id)
	{
		Optional<Employee> opt=repo.findById(id);
		
		if(opt.isPresent())
		{
			return(opt.get());
		}
		throw new ResourceNotFoundException("Customer", "id", id);
	}

	public Employee addCustomer(Employee customer) {
		return repo.save(customer);
	}
	
}
