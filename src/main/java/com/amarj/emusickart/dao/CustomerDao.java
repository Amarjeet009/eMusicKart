package com.amarj.emusickart.dao;

import java.util.List;

import com.amarj.emusickart.model.Customer;

public interface CustomerDao {
	
	void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);

}
