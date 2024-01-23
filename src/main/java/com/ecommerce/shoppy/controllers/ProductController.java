package com.ecommerce.shoppy.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.shoppy.entities.Products;
import com.ecommerce.shoppy.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Products> createProduct(@RequestBody Products product){
        Products newProduct = productService.createProduct(product);
        return ResponseEntity.ok(newProduct);
    }

    @GetMapping
    public ResponseEntity<List<Products>> getAllProducts(){
        List<Products> allProducts = productService.getAllProducts();
        return ResponseEntity.ok(allProducts);
    }
    
}