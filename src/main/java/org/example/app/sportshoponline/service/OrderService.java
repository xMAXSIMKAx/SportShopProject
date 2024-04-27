package org.example.app.sportshoponline.service;

import org.example.app.sportshoponline.model.Order;

import java.util.List;

public class OrderService {
    private DbService dbService;

    public OrderService(DbService dbService) {
        this.dbService = dbService;
    }

    public void placeOrder(Order order) {
        dbService.save(order);
    }

    public void cancelOrder(int orderId) {
        dbService.delete(Order.class, orderId);
    }

    public List<org.springframework.core.annotation.Order> getUserOrders(int userId) {
        return dbService.getUserOrders(userId);
    }
}