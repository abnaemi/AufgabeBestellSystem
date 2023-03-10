package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public  class ProductRepo {
    private List<Product> productList;

    public ProductRepo() {
        productList = new ArrayList<Product>();
    }

    public void add(Product product) {
        productList.add(product);
    }

    public Product get(int index) {
        return productList.get(index);
    }

    public List<Product> list() {
        return productList;
    }
}