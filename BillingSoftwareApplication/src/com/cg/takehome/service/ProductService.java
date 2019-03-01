package com.cg.takehome.service;

import com.cg.takehome.beans.Product;
import com.cg.takehome.exceptions.InvalidProductCode;
import com.cg.takehome.exceptions.InvalidQuantityException;
import com.cg.takehome.exceptions.ProductNotFoundException;

public interface ProductService {
	Product getProductDetails(int productCode) throws ProductNotFoundException,InvalidProductCode;
	public int calculateBill(int productPrice,int quantity) throws InvalidQuantityException;
}

