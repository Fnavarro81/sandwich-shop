package com.pluralsight;

import java.util.*;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Sandwich Size input
        System.out.println("Would you like 1.Regular: base price $5.45 or 2.Large: base price $8.95?: ");
        String size = inputScanner.next();

        // Age input
        System.out.println("What is your age?: ");
        String age = inputScanner.next();

        // Assigning variables
        double sandwichPrice = 0;
        double regularPrice = 5.45;
        double largePrice = 8.95;
        double pediatricAge = 0;
        double geriatricAge = 0;

        // Assigning Price
        if (size.equalsIgnoreCase("1")) {
            sandwichPrice = regularPrice;
        } else if (size.equalsIgnoreCase("2")) {
            sandwichPrice = largePrice;
        }




    }
}
