package com.jm3007.learn.spring.rest.service;

import java.util.List;

import com.jm3007.learn.spring.rest.model.Customer;

public interface CustomerService {
	Long saveCustomer(Customer customer);

	Customer getCustomer(Long id);
	
	List<Customer> getCustomers();
	
	void updateCustomer(Customer customer);
	
	void deleteCustomer(Long id);
}
