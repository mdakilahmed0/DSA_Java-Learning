package com.akil;

import java.util.Scanner;

public class FibonacciSeriesUpton {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0, b = 1;
        int nextTerm;
        System.out.print(a+" , "+b+ " , ");
        for(int i=2; i<n;i++){
            nextTerm = a + b;
            a = b;
            b = nextTerm;

            System.out.print(nextTerm+ " ,");
        }

    }
}
