package com.cg.takehome.service;

import com.cg.takehome.beans.Product;
import com.cg.takehome.dao.IProductDAO;
import com.cg.takehome.dao.ProductDAO;
import com.cg.takehome.exceptions.InvalidProductCode;
import com.cg.takehome.exceptions.InvalidQuantityException;
import com.cg.takehome.exceptions.ProductNotFoundException;

public class IProductService implements ProductService {
ProductDAO dao=new IProductDAO();
	@Override
	public Product getProductDetails(int productCode) throws ProductNotFoundException,InvalidProductCode {
	Product detail =dao.getProductDetails(productCode);
	String productcode=productCode+"";    //convert int to String (productCode)
	
	if(productcode.length()!=4)      
		throw new InvalidProductCode("Invalid Product Code");
	
	
	if (detail==null)
		throw new ProductNotFoundException("Product Not Found");
	
		return dao.getProductDetails(productCode);
	}
	
	public int calculateBill(int productPrice,int quantity) throws InvalidQuantityException {
		int bill=productPrice*quantity;
		if(quantity<=0)
			throw new InvalidQuantityException("Invalid Quantity");
		return bill;
	}
	
}
