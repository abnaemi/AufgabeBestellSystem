package org.example;
import java.util.List;

public class Order {
   protected int id;
   //protected List<Product> products;
    protected Product products;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }

    public Order(int id, Product products) {
        this.id = id;
        this.products = products;


    }
}