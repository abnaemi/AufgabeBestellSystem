package Models;

import java.util.Objects;

public class Product {


    protected int id;
  protected   String product;

    public Product ( int id, String product) {

        this.id = id;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", product='" + product + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product1)) return false;
        return id == product1.id && Objects.equals(product, product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product);
    }
}








