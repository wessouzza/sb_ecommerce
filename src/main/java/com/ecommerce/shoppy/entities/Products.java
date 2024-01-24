package com.ecommerce.shoppy.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private int sku;
    private int quantity;
    private double price;
    private String imgUrl;
    @ManyToMany(mappedBy = "products")
    private List<Order> orders = new ArrayList<>();

    public Products(){}

    public Products(String name, String description, int sku, int quantity, double price, String imgUrl){
        this.name = name;
        this.description = description;
        this.sku = sku;
        this.quantity = quantity;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    
    public long getId() {
        return id;
    }

    
    public void setId(long id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    
    public int getSku() {
        return sku;
    }

    
    public void setSku(int sku) {
        this.sku = sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    public double getPrice() {
        return this.price;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }

    
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}