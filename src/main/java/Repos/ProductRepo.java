package Repos;

import Objekte.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public  class ProductRepo {
    protected  List<Product> productList;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductRepo that)) return false;
        return Objects.equals(productList, that.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productList=" + productList +
                '}';
    }
}