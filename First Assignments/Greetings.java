package com.akil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("What is your name, Sir?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Hello "+name+", Welcome to Bangalore!");
    }
}
