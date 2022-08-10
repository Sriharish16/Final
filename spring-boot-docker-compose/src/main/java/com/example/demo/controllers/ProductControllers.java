package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.services.ProductService;

@RestController
public class ProductControllers {
	
	@Autowired
	private ProductService service;
	
//	@Autowired
//	@Qualifier("tv")
//	private Product tv;
//	
//	@Autowired
//	@Qualifier("printer")
//	private Product printer;
//	
//	@GetMapping(path="/products/{id}")
//	public Product getProduct(@PathVariable("id")int id) {
//		return id==1?tv:printer;
//		
//	}
	
	@GetMapping(path="/products")
	public List<Product>findAll(){
		return this.service.findAll();
	}
	

	@PostMapping(path="/product")
	public ResponseEntity<Product>save(@RequestBody Product entity){
		Product added =this.service.add(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(added);
	}
}
