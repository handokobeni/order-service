package com.handokobeni.orderservice.service;

import com.handokobeni.orderservice.entity.Order;
import com.handokobeni.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order saveOrder(Order order) {
        return repository.save(order);
    }
}
