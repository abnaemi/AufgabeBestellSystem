package Service;

import Models.Order;
import Models.Product;
import Repos.OrderRepo;
import Repos.ProductRepo;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShopService that)) return false;
        return Objects.equals(productRepo, that.productRepo) && Objects.equals(orderRepo, that.orderRepo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productRepo, orderRepo);
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "productRepo=" + productRepo +
                ", orderRepo=" + orderRepo +
                '}';
    }
}