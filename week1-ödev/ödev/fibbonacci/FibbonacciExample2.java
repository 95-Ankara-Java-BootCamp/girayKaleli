package com.week1.ödev.fibbonacci;

import java.util.Scanner;

public class FibbonacciExample2 {

    public static int fibbonacci(int number){

            if (number <= 1){
                return number;
            }

            /*
                this is recursive method. When number is more than 1 method will add number to the next number
                and continue by adding
             */

           return fibbonacci(number - 1) + fibbonacci(number - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your fibbonacci number : ");
        int fib = scanner.nextInt();

        for (int i = 0; i < fib; i++){
            System.out.print(fibbonacci(i) + " ");
        }

        scanner.close();
    }

}
