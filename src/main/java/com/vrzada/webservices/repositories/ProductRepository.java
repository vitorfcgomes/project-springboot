package com.vrzada.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrzada.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
