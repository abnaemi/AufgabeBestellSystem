package Service;

import Models.Order;
import Models.Product;
import Repos.ProductRepo;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @org.junit.jupiter.api.Test
    void getProduct() {

        ShopService shop = new ShopService();
        Product product = new Product(1,"Smartphone");
        Product product2 = new Product(2,"Notebook");
        Product product3 = new Product(3,"Camera");



        int id =2;
        Product expected = product3 = new Product(3,"Camera");
        Product actual = shop.getProduct(id);

        assertEquals(expected,actual);

    }

    @org.junit.jupiter.api.Test
    void addOrder() {

        ShopService shop = new ShopService();
        Product randomproduct = new Product(3,"Camera");
        Order orderactual = new Order(1,randomproduct);
        Order orderexpected = new Order(1,randomproduct);

        shop.addOrder(orderexpected);
        shop.addOrder(orderexpected);
        shop.getOrder(0);


        System.out.println(shop.getOrder(0));
        assertEquals(orderexpected,shop.getOrder(1));


        // assertEquals(expected,actual);



    }

    @org.junit.jupiter.api.Test
    void getOrder() {

        ShopService shop = new ShopService();
        Product randomproduct = new Product(3,"Camera");
        Order orderactual = new Order(1,randomproduct);
        Order orderexpected = new Order(1,randomproduct);
        shop.addOrder(orderexpected);
        shop.addOrder(orderexpected);
        shop.addOrder(orderexpected);



        System.out.println(shop.getOrder(0));
        assertEquals(shop.getOrder(0),shop.getOrder(1));



    }
}