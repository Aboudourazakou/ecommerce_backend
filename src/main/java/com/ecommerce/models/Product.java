package com.ecommerce.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product{
	
	
	
	

	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	private String name,description;
	private Integer qty;
	private Double price;
	
	
	public Product(){};
	public Product(Integer id,String name,String description,Integer qty,Double price) {
		
		this.name=name;
		this.id=id;
		this.description=description;
		this.qty=qty;
		this.price=price;
	}
   public Product(String name,String description,Integer qty,Double price) {
		
		this.name=name;
		this.description=description;
		this.qty=qty;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", qty=" + qty + ", price="
				+ price + ", getName()=" + getName() + ", getDescription()=" + getDescription() + ", getId()=" + getId()
				+ ", getQty()=" + getQty() + ", getPrice()=" + getPrice();
	}
	
	
	
	
	

}
