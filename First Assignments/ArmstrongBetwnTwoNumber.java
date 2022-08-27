package com.akil;

import java.util.Scanner;

public class ArmstrongBetwnTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();

        for(int i=num1; i<num2; i++){
            int remainder, original, sum=0;
            original = i;
            while (original!=0){
                remainder = original%10;
                sum = sum + (remainder * remainder *remainder);
                original = original/10;
            }
            if(sum==i){
                System.out.println(i+" is a Armstrong number.");
            }
        }

    }
}
