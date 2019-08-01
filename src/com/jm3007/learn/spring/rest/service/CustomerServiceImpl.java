package com.jm3007.learn.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jm3007.learn.spring.rest.dao.CustomerDao;
import com.jm3007.learn.spring.rest.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Long saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	@Override
	public Customer getCustomer(Long id) {
		return customerDao.getCustomer(id);
	}

	@Override
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Long id) {
		customerDao.deleteCustomer(id);
	}

}
