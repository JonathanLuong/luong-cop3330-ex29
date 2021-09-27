package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        boolean flag = false;

        System.out.printf("What is the rate of return? ");
        int rate = reader.nextInt();
        int years = 0;

        while(flag != true) {
            if(rate > 0) {
                years = 72/rate;
                flag = true;
                System.out.printf("It will take " + years + " years to double your initial investment.\n ");
            }
            else {
                System.out.printf("Sorry. That's not a valid input.\n ");
                System.out.printf("What is the rate of return? ");
                rate = reader.nextInt();
            }
        }
    }
}