package com.ecommerce.shoppy.dto;

import com.ecommerce.shoppy.entities.Products;

public class OrderItemDto {
    private Products product;
    private int quantity;

    public Products getProducts() {
        return  product;
    }

    public void setProducts(Products product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
