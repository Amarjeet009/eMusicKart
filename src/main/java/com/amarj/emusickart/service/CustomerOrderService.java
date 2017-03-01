package com.amarj.emusickart.service;

import com.amarj.emusickart.model.CustomerOrder;

public interface CustomerOrderService {
	
	 void addCustomerOrder(CustomerOrder customerOrder);

	    double getCustomerOrderGrandTotal(int cartId);

}
