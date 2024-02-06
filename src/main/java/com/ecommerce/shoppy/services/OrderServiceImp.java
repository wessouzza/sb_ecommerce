package com.ecommerce.shoppy.services;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.shoppy.entities.Order;
import com.ecommerce.shoppy.entities.OrderItem;
import com.ecommerce.shoppy.enums.OrderStatus;
import com.ecommerce.shoppy.repositories.OrderRepository;

@Service
public class OrderServiceImp implements OrderService{

    private final OrderRepository orderRepository;

    public OrderServiceImp(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        Order newOrder = new Order();
        newOrder.setCustomer(order.getCustomer());
        newOrder.setOrderTime(Instant.now());
            
        //List<OrderItem> orderItems = new ArrayList<>();
        

        return orderRepository.save(newOrder);

    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOneOrder(long id) {
        return orderRepository.findById(id);
    }
    
}