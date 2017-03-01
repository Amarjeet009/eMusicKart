package com.amarj.emusickart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amarj.emusickart.dao.ProductDao;
import com.amarj.emusickart.model.Product;
import com.amarj.emusickart.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
    private ProductDao productDao;
	
	@Override
	public List<Product> getProductList() {
		return productDao.getProductList();
	}

	@Override
	public Product getProductById(int id) {
		 return productDao.getProductById(id);
	}

	@Override
	public void addProduct(Product product) {
		 productDao.addProduct(product);
		
	}

	@Override
	public void editProduct(Product product) {
		productDao.editProduct(product);
		
	}

	@Override
	public void deleteProduct(Product product) {
		productDao.deleteProduct(product);
		
	}

}
