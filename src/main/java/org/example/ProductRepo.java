package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    String[] products= {"Notebook", "Camera", "Smartphone"};

    public String[] getProducts() {
        return products;
    }
    public String listProducts(int x){
        return products[x];
    }
}