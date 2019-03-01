package com.cg.takehome.dao;

import java.util.Collections;

import com.cg.takehome.beans.Product;
import com.cg.takehome.util.CollectionUtil;

public class IProductDAO implements ProductDAO {

	@Override
	public Product getProductDetails(int productCode){
		
	Product details=CollectionUtil.getProducts().get(productCode);
	return details;
	}

	
	}


