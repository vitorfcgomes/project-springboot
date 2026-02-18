package com.vrzada.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrzada.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
