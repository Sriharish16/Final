package org.example;

import org.example.service.ProductService;

import static org.hamcrest.Matchers.*;

import java.util.List;

import org.hamcrest.core.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;


public class ProductServiceTest {
	
	public ProductService service =null;
	@BeforeEach
	void init() {
		
		service=new ProductService();
	}
	@DisplayName(value="Test findDiscount method returns 0.20 or above  for tv and laptop")
	@Test
	void testFindDiscount() {
		double actual =service.findDiscount("tv");
		
		assertThat(actual, is(greaterThan(0.19)));

		
	}
	@DisplayName(value="Test findDiscount method returns 0.10 or above  for fridge and washing machine")
	@Test
	void testFindDiscountCaseTwo() {
		
		double actual =service.findDiscount("fridge");
		
		assertThat(actual, is(greaterThan(0.0)));
		
		
	}
	
//	@DisplayName(value="Test findProducts method returns a list of 4 brands")
//	@Test
//	void testFindProducts() {
//		String [] actual=service.findProducts();
//		assertThat(actual, is(hasSize(4)));
//		
//		
//	}
	@DisplayName(value="Test findProducts method return a list containing" + "Dell,Lenovo,Hp,Asus for product laptop")
	@Test
	void testProducts() {
	
	
	String[] actual = service.findProducts();

	assertThat(actual, is(arrayContaining("Dell","Lenovo","Hdsp","Asus")));
	

}
	@Test
	@DisplayName(value = "Test findProducts method returns a tv contains in the list")
	void testFindProducts() {
	List<String> list=service.findProduct();
	
	assertThat(list, hasItem("tv"));
		
	}

	@Test
	@DisplayName(value = "Test findProducts method returns a list of four brands")
	void testFindProductsList() {
	//List<String> list=Arrays.asList("Dell","Hp","Lava","Lenova");
	List<String> list=service.findProduct();
	assertThat(list,hasItems("tv","laptop","phone","washing machine"));
	
	}
	


}
