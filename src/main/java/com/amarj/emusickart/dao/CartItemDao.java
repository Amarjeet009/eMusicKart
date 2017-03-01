package com.amarj.emusickart.dao;

import com.amarj.emusickart.model.Cart;
import com.amarj.emusickart.model.CartItem;

public interface CartItemDao {
	
	void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);

}
