package com.jm3007.learn.spring.rest.dao;

import java.util.List;

import com.jm3007.learn.spring.rest.model.Customer;

public interface CustomerDao {
	Long saveCustomer(Customer customer);

	Customer getCustomer(Long id);
	
	List<Customer> getCustomers();
	
	void updateCustomer(Customer customer);
	
	void deleteCustomer(Long id);
}
