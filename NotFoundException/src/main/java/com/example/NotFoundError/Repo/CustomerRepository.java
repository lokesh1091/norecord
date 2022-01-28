package com.example.NotFoundError.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NotFoundError.Entity.Employee;

public interface CustomerRepository extends JpaRepository<Employee, Integer>{

}
