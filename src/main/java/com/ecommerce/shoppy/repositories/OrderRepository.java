package com.ecommerce.shoppy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shoppy.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    Order findById(long id);
}