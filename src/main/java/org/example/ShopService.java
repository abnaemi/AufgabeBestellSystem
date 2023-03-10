package org.example;

import java.util.List;

public class ShopService {

    protected ProductRepo productRepo;
    protected OrderRepo orderRepo;

    public ShopService() {
        productRepo = new ProductRepo();
        orderRepo = new OrderRepo();
        productRepo.add(new Product(1, "Smartphone"));
        productRepo.add(new Product(2, "Notebook"));
        productRepo.add(new Product(3, "Camera"));

    }


    public List<Product> listProducts() {
        return productRepo.list();
    }

    public Product getProduct(int id) {
        return productRepo.get(id);
    }


    public void addOrder(Order order) {
        orderRepo.add(order);
    }

    public Order getOrder(int id) {
        return orderRepo.get(id);
    }

    public List<Order> listOrders() {
        return orderRepo.list();
    }
}