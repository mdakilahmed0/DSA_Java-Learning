package com.akil;

import java.util.Scanner;

public class RupeesToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in rupees: ");
        double amount = input.nextDouble();

        double toDollar = amount * 79.56;
        System.out.println("The Equivalent amount in dollar is "+ toDollar);
    }
}
