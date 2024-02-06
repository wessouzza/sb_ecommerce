package com.ecommerce.shoppy.entities;

import java.io.Serializable;

import com.ecommerce.shoppy.pk.OrderProductPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class OrderItem implements Serializable{
    public static final long serialVersionUID = 1L;
    @EmbeddedId
    private OrderProductPK id;
    private int quantity;
    private double price;

    public OrderItem() {}

    public OrderItem(Order order, Products product, int quantity, double price) {
        id = new OrderProductPK();
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }
    
    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Products getProducts() {
        return id.getProduct();
    }

    public void setProduct(Products product) {
        id.setProduct(product);
    }

    /**
     * @return OrderProductPK return the id
     */
    public OrderProductPK getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(OrderProductPK id) {
        this.id = id;
    }

    /**
     * @return int return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

}