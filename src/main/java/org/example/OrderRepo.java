package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderRepo {
    protected ArrayList<Order> orders;

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

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderRepo orderRepo)) return false;
        return Objects.equals(orders, orderRepo.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }
}