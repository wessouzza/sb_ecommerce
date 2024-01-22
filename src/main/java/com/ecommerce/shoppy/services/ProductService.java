package com.ecommerce.shoppy.services;

import java.util.List;

import com.ecommerce.shoppy.entities.Products;

public interface ProductService {
    Products createProduct(Products product);

    List<Products> getAllProducts();

    Products getOne(long id);
}
