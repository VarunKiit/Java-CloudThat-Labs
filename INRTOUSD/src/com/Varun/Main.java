package com.Varun;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice \n 1. convert INR -> USD \n 2. Convert USD -> INR \n -999 to quit");
        int choice = sc.nextInt();

        while (choice != -999){
            if(choice == 1){
                System.out.println("Enter the INR value(Rupees): ");
                double inrValue = sc.nextDouble();
                System.out.printf("USD = : $%.2f", 0.012 * inrValue);
            } else{
                System.out.println("Enter the USD value: ");
                double usdValue = sc.nextDouble();
                System.out.printf("INR = : Rs. %.2f",  usdValue/0.012);
            }

            System.out.println();
            System.out.println("Enter choice \n 1. convert INR -> USD \n 2. Convert USD -> INR \n -999 to quit");
            choice = sc.nextInt();

        }
    }
}
