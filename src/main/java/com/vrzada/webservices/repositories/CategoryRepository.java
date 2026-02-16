package com.vrzada.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrzada.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
