package com.akil;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
