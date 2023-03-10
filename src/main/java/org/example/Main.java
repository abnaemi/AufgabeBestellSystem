package org.example;

import Models.Order;
import Models.Product;
import Service.ShopService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Created Shop
        ShopService shop = new ShopService();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press all for all products. Press id to search for specific ids. Press exit to exit");
            String option = scanner.nextLine();
            if (option.equals("all")) {
                System.out.println(shop.listProducts());
            } else if (option.equals("id")) {
                try {System.out.println("Enter the ID of the Product you search");
                int id = scanner.nextInt();
                System.out.println(shop.getProduct(id));} catch (Exception e) {
                    System.out.println("This ID does not exist");
                    continue;}
            } else if (option.equals("exit")) {
                break;
            } else {
                System.out.println("Input does not equal name or id, try again.");
            } }



        while (true){ try  {
        System.out.println("Do you want to order?");
        String orderOption = scanner.nextLine();
            if (orderOption.equals("no")){
                break;}
        if (orderOption.equals("yes")) {
            System.out.println("What do you want to order? Please enter the ID.");
            int orderIDoptionTwo = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please enter the product name");
            String orderOptionTwo = scanner.nextLine();
            Product productone = new Product(orderIDoptionTwo, orderOptionTwo);
            System.out.println("Order created: " + productone);
            if (shop.listProducts().contains(productone)){
                System.out.println("Product exists");
                Order orderOne = new Order(1, productone);
                shop.addOrder(orderOne);
                System.out.println("Order created");
            } else {
                System.out.println("Invalid name or id");
            }


        }} catch (Exception e){
     System.out.println("Wrong input, start again");
 }}

while (true) {
    System.out.println("You can view your order history. Input a number. First order equals 0. You can leave the programm in the next step");
    try {
        int orderNumber = scanner.nextInt();
        System.out.println(shop.getOrder(orderNumber));
    } catch (Exception e) {
        System.out.println("Order number invalid");
    }

    System.out.println("List all orders? (input yes or no for exit)");
    Scanner scanner2 = new Scanner(System.in);
    String allOrdersInput = scanner2.nextLine();
    if (allOrdersInput.equals("yes")) {
        System.out.println(shop.listOrders());
    } else {
        break;
    }
}
}

    }






