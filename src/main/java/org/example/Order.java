package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    int id;
    List<Product> products;

    public Order(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }
}
