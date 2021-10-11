package com.ecommerce.controllers;

import java.sql.Date;

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
		
		String pic[]= {"image1","image2"};
		Date d=new Date(51);
		Product product=new Product(1,"T-s","Ce",23,12,21,567.,d,"20-10-2021",pic);
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
