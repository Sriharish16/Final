package org.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductService {
	
	public double findDiscount(String product) {
		double discount =0.10;
		if(product.equals("tv")||product.equals("laptop")) {
			discount=0.20;
		}
		return discount;
	}
	
	public String[] findProducts() {
		
		String[] list1= {"Dell","Lenovo","Hp","Asus"};
		return list1;
		
	}
	
public List<String> findProduct() {
		
		List<String> products = Arrays.asList("tv","laptop","phone","washing machine");
		return products;
		
	}
	
	}


