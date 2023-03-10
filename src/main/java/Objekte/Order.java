package Objekte;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return id == order.id && Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products);
    }
}