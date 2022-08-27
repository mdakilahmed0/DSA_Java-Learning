package com.akil;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal Amount:");
        int principal = input.nextInt();
        System.out.println("Enter the rate of Interest");
        double rate = input.nextDouble();
        System.out.println("Enter the tenure in years");
        int time = input.nextInt();

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println(simpleInterest);
    }
}
