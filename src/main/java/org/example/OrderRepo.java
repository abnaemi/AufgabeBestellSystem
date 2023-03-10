package org.example;
import java.util.ArrayList;
import java.util.List;

public class OrderRepo {

    String orders;

    private List<Order> orders;

    public OrderRepo() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrderById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}