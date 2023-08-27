package com.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crud.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>
{
		
       public List<Customer> findByCusAge(String cusAge);
       
}
