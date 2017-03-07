package com.amarj.emusickart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amarj.emusickart.dao.CartDao;
import com.amarj.emusickart.model.Cart;
import com.amarj.emusickart.service.CartService;

@Service
public class CartServiceImpl implements CartService {


    @Autowired
    private CartDao cartDao;
	

	public Cart getCartById(int cartId) {
		return cartDao.getCartById(cartId);
	}

	
	public void update(Cart cart) {
		cartDao.update(cart);
		
	}

}
