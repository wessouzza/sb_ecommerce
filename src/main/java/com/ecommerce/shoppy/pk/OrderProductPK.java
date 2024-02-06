package com.ecommerce.shoppy.pk;

import java.io.Serializable;

import com.ecommerce.shoppy.entities.Order;
import com.ecommerce.shoppy.entities.Products;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderProductPK implements Serializable {
    public static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    public Order getOrder(){
        return order;
    }

    public void setOrder(Order order){
        this.order = order;
    }

    public Products getProduct(){
        return product;
    }

    public void setProduct(Products product){
        this.product = product;
    }
}