package com.amarj.emusickart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amarj.emusickart.dao.CustomerOrderDao;
import com.amarj.emusickart.model.Cart;
import com.amarj.emusickart.model.CartItem;
import com.amarj.emusickart.model.CustomerOrder;
import com.amarj.emusickart.service.CartService;
import com.amarj.emusickart.service.CustomerOrderService;

@Service
public class CustmerOrderServiceImpl implements CustomerOrderService {
    
	@Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;
	
	@Override
	public void addCustomerOrder(CustomerOrder customerOrder) {
		customerOrderDao.addCustomerOrder(customerOrder);
		
	}

	@Override
	public double getCustomerOrderGrandTotal(int cartId) {
		double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems){
            grandTotal += item.getTotalPrice();
        }

        return grandTotal;
	}

}
