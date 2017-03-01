package com.amarj.emusickart.service;

import com.amarj.emusickart.model.Cart;

public interface CartService {
	Cart getCartById(int cartId);

    void update(Cart cart);

}
