package com.Varun;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        NewProduct p1 = new NewProduct("Onion", 45.6);
        Product p2 = new Product();
        NewProduct p3 = new NewProduct("Laptop", 25000, 1234);

        System.out.println("Product P1 is: "+ p1);
        System.out.println("Product P2 is: "+ p2);
        }
    }
