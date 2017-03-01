package com.amarj.emusickart.service;

import java.util.List;

import com.amarj.emusickart.model.Product;

public interface ProductService {
	
	List<Product> getProductList();

    Product getProductById (int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

}
