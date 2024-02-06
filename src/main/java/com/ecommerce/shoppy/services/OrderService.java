package com.ecommerce.shoppy.services;

import java.util.List;

import com.ecommerce.shoppy.entities.Order;

public interface OrderService {
    public Order createOrder(Order order);

    public List<Order> getAllOrders();

    public Order getOneOrder(long id);
}