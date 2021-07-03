package com.week1.ödev.fibbonacci;

import java.util.Scanner;

public class FibbonacciNumber {

    public static void main(String[] args) {

        // create the scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter fibbonacci number : ");
        int number = scanner.nextInt();

        // begin first number is 0  and second is 1 Because Fibbonnaci number is such as : 0 1 1 2 3 5 (num1 + num2 = next number)
        int num1 = 0, num2 = 1, num3 = 0;

        for (int i = 0; i < number; i++){

            System.out.print(num1 + " ");

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

        }


        scanner.close();

    }

}
