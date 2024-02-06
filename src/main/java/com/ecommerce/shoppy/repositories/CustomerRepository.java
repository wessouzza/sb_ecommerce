package com.ecommerce.shoppy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shoppy.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}