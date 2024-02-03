package com.ecommerce.shoppy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shoppy.entities.Products;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products, Long> {

    List<Products> findByName(String name);

    Products findBySku(int sku);
    
}