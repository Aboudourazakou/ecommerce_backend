package com.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dao.ProductDao;
import com.ecommerce.models.Product;

@RestController
@CrossOrigin(origins = "http://localhost:8080") 
public class ProductsController {

	
	@Autowired
	private ProductDao productdao;
	@RequestMapping(value="/product")
	@ResponseBody
	public String createproduct() {
		
		Product product=new Product("Cocoa Japon","Pour une bonne tasse de cafe",23,2700.);
		productdao.save(product);
		return "Produit bien cree";
	}
	
	
	@DeleteMapping(value="delete/product/{id}")
	public String deleteproduct(@PathVariable("id") Integer id) {
		
		productdao.deleteById(id);
		
		return "success";
		
		
	}
	
	
	@PostMapping(value="update/product") 
	
	
	public void updateproduct(@RequestBody Product product) {
		 
		  productdao.save(product);	
	}
		
	

}
