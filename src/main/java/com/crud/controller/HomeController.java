package com.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entities.Customer;
import com.crud.repository.CustomerRepository;

@RestController
public class HomeController {

	@Autowired
	private CustomerRepository customerRepository;
	@PostMapping("/create") 
	public String create(@RequestBody Customer customer) 
	{
			customerRepository.save(customer);
			return "Successfully Created";
	}
	@PutMapping("/update") 
	public String update(@RequestBody Customer customer) 
	{
			customerRepository.save(customer);
			return "Successfully updated";
	}
	@GetMapping("/customer") 
	public List<Customer> customersexist() 
	{
		  List<Customer>customers =    customerRepository.findAll();
			return customers;
			
	}
	@GetMapping("/customer/{id}") 
	public Optional<Customer> create(@PathVariable Integer id) 
	{
	     Optional<Customer>   customer =customerRepository.findById(id);
			
			return customer;
	}
	@DeleteMapping("/customer/{id}") 
	public String delete(@PathVariable Integer id) 
	{
	  //   Optional<Customer>   customer =customerRepository.findById(id);
		customerRepository.deleteById(id);
			
			return "Successfully Deleted";
	}
	@GetMapping("/customer/age/{cusAge}") 
	public List<Customer> create(@PathVariable String cusAge) 
	{
	     List<Customer>   customer =customerRepository.findByCusAge(cusAge);
			
			return customer;
	}
}
