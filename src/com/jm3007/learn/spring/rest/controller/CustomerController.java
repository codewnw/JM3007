package com.jm3007.learn.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jm3007.learn.spring.rest.model.Customer;
import com.jm3007.learn.spring.rest.service.CustomerService;

@RestController
@RequestMapping(value = "/rest/v1/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping(value = "/")
	public Long saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Customer getCustomer(@PathVariable("id") Long id) {
		return customerService.getCustomer(id);
	}

	@GetMapping("/")
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	@PutMapping("/")
	void updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
	}

	@DeleteMapping("/{id}")
	void deleteCustomer(@PathVariable("id") Long id) {
		customerService.deleteCustomer(id);
	}

}
