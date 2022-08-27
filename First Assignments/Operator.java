package com.akil;

import java.util.Objects;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter the operator:  ");
        String operator = input.next();

        if(Objects.equals(operator, "+")){
            int addition = num1 + num2;
            System.out.println("Addition of the given number is: "+ addition);
        } else if(Objects.equals(operator, "-")){
            int subtraction = num1 - num2;
            System.out.println("Subtraction of the given number is: "+ subtraction);
        } else if(Objects.equals(operator, "*")){
            int multiply = num1 * num2;
            System.out.println("Multiplication of the given number is: "+ multiply);
        } else if(Objects.equals(operator, "/")){
            int division = num1 / num2;
            System.out.println("Division of the given number is: "+ division);
        }
    }
}
