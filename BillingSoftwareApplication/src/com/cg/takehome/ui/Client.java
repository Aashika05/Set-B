package com.cg.takehome.ui;

import java.util.Scanner;

import com.cg.takehome.beans.Product;
import com.cg.takehome.exceptions.InvalidProductCode;
import com.cg.takehome.exceptions.InvalidQuantityException;
import com.cg.takehome.exceptions.ProductNotFoundException;
import com.cg.takehome.service.IProductService;
import com.cg.takehome.service.ProductService;

public class Client {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		ProductService service=new IProductService();
		while(true) {
			System.out.println("1. Generate Bill by entering Product Code and Quantity");
			System.out.println("2. Exit");

			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Product Details");
				System.out.println("Enter the product code");
				int productCode=sc.nextInt();
				System.out.println("Enter the quantity");
				int quantity=sc.nextInt();

				System.out.println("Calculation the total and displaying the bill");

				try {
					Product productdetails = service.getProductDetails(productCode);
					System.out.println("Details"+productdetails);
					try {
						int bill = service.calculateBill(productdetails.getProductPrice(),quantity);
						System.out.println("Calculate bill"+bill);
					} catch (InvalidQuantityException e) {
						System.out.println(e.getMessage());}	
				} catch (ProductNotFoundException | InvalidProductCode e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
