package org.example;

public class Main {
    public static void main(String[] args) {

        // Created Shop
        ShopService shop = new ShopService();

  // Created first Product
   Product productOne = new Product(1, "Smartphone");
    // Created two orders
    Order orderOne = new Order(1,productOne);
    Order orderTwo = new Order(1,productOne);

    // Created order list instead of two new Orders
    ProductRepo orderList = new ProductRepo();
    orderList.add(productOne);
    orderList.add(productOne);

    // added orderOne two the orderRepo, which is created when shop is created
    shop.addOrder(orderOne);
    shop.addOrder(orderTwo);

        System.out.println( shop.getProduct(0));

    }
}