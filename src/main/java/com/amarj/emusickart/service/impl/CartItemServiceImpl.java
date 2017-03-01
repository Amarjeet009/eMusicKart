package com.amarj.emusickart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amarj.emusickart.dao.CartItemDao;
import com.amarj.emusickart.model.Cart;
import com.amarj.emusickart.model.CartItem;
import com.amarj.emusickart.service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService{
 

    @Autowired
    private CartItemDao cartItemDao;
	
	
	@Override
	public void addCartItem(CartItem cartItem) {
	
		 cartItemDao.addCartItem(cartItem);
		
	}

	@Override
	public void removeCartItem(CartItem cartItem) {
		 cartItemDao.removeCartItem(cartItem);
		
	}

	@Override
	public void removeAllCartItems(Cart cart) {
		  cartItemDao.removeAllCartItems(cart);
		
	}

	@Override
	public CartItem getCartItemByProductId(int productId) {
		 return cartItemDao.getCartItemByProductId(productId);
	}

}
