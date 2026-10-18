package com.pluralsight;

import java.util.*;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Size input
        System.out.println("Would you like 1.Regular: base price $5.45 or 2.Large: base price $8.95?: ");
        String size = inputScanner.next();

        // Age input
        System.out.println("What is your age?: ");
        String age = inputScanner.next();
    }
}
