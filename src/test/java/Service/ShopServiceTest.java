package Service;

import Models.Order;
import Models.Product;
import Repos.ProductRepo;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @org.junit.jupiter.api.Test
    void getProduct() {



    }

    @org.junit.jupiter.api.Test
    void addOrder() {




    }

    @org.junit.jupiter.api.Test
    void getOrder() {
        ShopService shop = new ShopService();
        Product product = new Product(1,"Smartphone");
        Product product2 = new Product(2,"Notebook");
        Product product3 = new Product(3,"Camera");



        int id =2;
        Product expected = product3 = new Product(3,"Camera");
        Product actual = shop.getProduct(id);

        assertEquals(expected,actual);




    }
}