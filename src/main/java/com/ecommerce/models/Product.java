package com.ecommerce.models;



import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import jakarta.validation.constraints.Max;

@Entity
public class Product{
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	@NotNull
	@Max(value = 1, message = "Age should not be less than 18")
	private String name,infos;
	@NotNull
	private int idCat,idSupplier,qty;
	@NotNull
	private double price;
	
	@Basic
	@NotNull
    private java.sql.Date created_at;
	private String expire_at;
	@NotNull
	private String pictures[];
	
	
	public Product(int id, String name, String infos, int idCat, int idSupplier, int qty, double price, Date created_at,
			String expire_at, String[] pictures) {
		super();
		this.id = id;
		this.name = name;
		this.infos = infos;
		this.idCat = idCat;
		this.idSupplier = idSupplier;
		this.qty = qty;
		this.price = price;
		this.created_at = created_at;
		this.expire_at = expire_at;
		this.pictures = pictures;
	}


	public Product() {}

	

}
