package com.akil;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1  = input.nextDouble();
        double num2 = input.nextDouble();
        if(num1>num2){
            System.out.println(num1 + " is larger");
        } else {
            System.out.println(num2 + " is larger");
        }
    }
}
