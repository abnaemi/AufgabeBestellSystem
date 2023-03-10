package org.example;

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
}








