package com.amarj.emusickart.dao;

import java.io.IOException;

import com.amarj.emusickart.model.Cart;

public interface CartDao {
	Cart getCartById(int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);


}
