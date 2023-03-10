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
        }




    }
}