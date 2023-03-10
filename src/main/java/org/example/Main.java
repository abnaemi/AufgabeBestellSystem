package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Created Shop
        ShopService shop = new ShopService();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hello, if you want to view all items press: all If you want to view products by ID press id and if you want to leave press exit");
            String option = scanner.nextLine();
            if (option.equals("all")) {
                System.out.println(shop.listProducts());
            } else if (option.equals("id")) {
                try {System.out.println("Enter the ID");
                int id = scanner.nextInt();
                System.out.println(shop.getProduct(id));} catch (Exception e) {
                    System.out.println("ID does not exist");
                    continue;}
            } else if (option.equals("exit")) {
                break;
            } else {
                System.out.println("Wrong input, try again.");
            }
 try {
        System.out.println("Do you want to give an order?");
        String orderOption = scanner.nextLine();
        if (orderOption.equals("yes")) {
            System.out.println("What do you want to order? Type first the ID");
            int orderIDoptionTwo = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character
            System.out.println("Now type the product");
            String orderOptionTwo = scanner.nextLine();
            Product productone = new Product(orderIDoptionTwo, orderOptionTwo);
            System.out.println("Order created: " + productone);
            Order orderOne = new Order(1, productone);
            shop.addOrder(orderOne);
            System.out.println("Order created");
        }} catch (Exception e){
     System.out.println("Wrong input, start again");
 }
        System.out.println("Now you can watch your orders, press 0 for your first order and 1 for your second. If none available, it will exit");
        try {
            int orderNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character
            shop.getOrder(orderNumber);
        } catch (Exception e) {
            System.out.println("Order number invalid");
        }

        System.out.println("Want to see all orders?");
        String allOrders = scanner.nextLine();
        if (allOrders.equals("yes")) {
            shop.listOrders();
        }
    }}}







