package com.ecommerce.shoppy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.shoppy.entities.Products;
import com.ecommerce.shoppy.repositories.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Products createProduct(Products product) {
        return productRepository.save(product);
    }

    @Override
    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Products getOne(long id) {
        return productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Product not found."));
    }

    @Override
    public List<Products> findByName(String name) {
        List<Products> product = productRepository.findByName(name);

        if(product.isEmpty()) {
            throw new IllegalArgumentException("Product not found.");
        }

        return product;
    }

    @Override
    public Products findBySku(int sku) {
        Products product = productRepository.findBySku(sku);

        if(product == null) {
            throw new IllegalArgumentException("SKU does not exist.");
        } 

        return product;
    }
}