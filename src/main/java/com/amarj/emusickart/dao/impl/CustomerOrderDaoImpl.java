package com.amarj.emusickart.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amarj.emusickart.dao.CustomerOrderDao;
import com.amarj.emusickart.model.CustomerOrder;

@Repository
@Transactional
public class CustomerOrderDaoImpl implements CustomerOrderDao {

	
	    private SessionFactory sessionFactory;
	

	public void addCustomerOrder(CustomerOrder customerOrder) {
		 Session session = sessionFactory.getCurrentSession();
	        session.saveOrUpdate(customerOrder);
	        session.flush();
		
	}

}
