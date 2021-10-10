package com.ecommerce.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.models.Product;


public interface ProductDao extends JpaRepository <
Product,Integer> {
}
