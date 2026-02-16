package com.vrzada.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrzada.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
