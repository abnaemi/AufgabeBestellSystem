package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
    private List<Order> orders;

    public OrderRepo() {
        orders = new ArrayList<>();
    }

    public List<Order> list() {
        return orders;
    }

    public Order get(int index) {
        return orders.get(index);
    }

    public void add(Order order) {
        orders.add(order);
    }
}