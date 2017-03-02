package com.amarj.emusickart.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amarj.emusickart.dao.CustomerDao;
import com.amarj.emusickart.model.Authorities;
import com.amarj.emusickart.model.Cart;
import com.amarj.emusickart.model.Customer;
import com.amarj.emusickart.model.Users;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public void addCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();

        customer.getBillingAddress().setCustomer(customer);
        customer.getShippingAddress().setCustomer(customer);

        session.saveOrUpdate(customer);
        session.saveOrUpdate(customer.getBillingAddress());
        session.saveOrUpdate(customer.getShippingAddress());

        Users newUser = new Users();
        newUser.setUsername(customer.getUsername());
        newUser.setPassword(customer.getPassword());
        newUser.setEnabled(true);
        newUser.setCustomerId(customer.getCutomerId());

        Authorities newAuthorities = new Authorities();
        newAuthorities.setUsername(customer.getUsername());
        newAuthorities.setAuthority("ROLE_USER");

        session.saveOrUpdate(newUser);
        session.saveOrUpdate(newAuthorities);

        Cart newCart = new Cart();
        newCart.setCustomer(customer);
        customer.setCart(newCart);

        session.saveOrUpdate(customer);
        session.saveOrUpdate(newCart);

        session.flush(); 
		
	}

	
	public Customer getCustomerById(int customerId) {
	
		Session session = sessionFactory.getCurrentSession();
        return (Customer) session.get(Customer.class, customerId);
	}

	
	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer");
        @SuppressWarnings("unchecked")
		List<Customer> customerList = query.list();

        return customerList;
	}

	
	public Customer getCustomerByUsername(String username) {
		
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer where username = ?");
        query.setString(0, username);


        return (Customer) query.uniqueResult();
	}

}
