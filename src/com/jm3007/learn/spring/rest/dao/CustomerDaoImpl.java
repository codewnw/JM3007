package com.jm3007.learn.spring.rest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jm3007.learn.spring.rest.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public Long saveCustomer(Customer customer) {
		return (Long) sessionFactory.openSession().save(customer);
	}

	@Override
	@Transactional
	public Customer getCustomer(Long id) {
		Customer c = sessionFactory.openSession().get(Customer.class, id);
		if(c == null) {
			throw new RuntimeException("Customer Not Found!!!");
		}
		return c;
	}

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return sessionFactory.openSession().createQuery("from Customer").getResultList();
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	@Override
	@Transactional
	public void deleteCustomer(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
	}

}
