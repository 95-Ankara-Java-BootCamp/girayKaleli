/**
 * @author Guray Kaleli,2021
 *
 * @return example 1 --->
 * *********** Movies Type ***********
 * 1 : romantic
 * 2 : horror
 * 3 : action
 * 4 : sci-fiction
 * 5 : western
 * *********************************
 * Please select your movie type : 2
 * Please enter your age : 18
 * Your movie is : horror
 * Your ticket price is : 12.0
 *
 * example 2 --->
 * *********** Movies Type ***********
 * 1 : romantic
 * 2 : horror
 * 3 : action
 * 4 : sci-fiction
 * 5 : western
 * *********************************
 * Please select your movie type : 1
 * Please enter your age : 18
 * Your movie is : romantic
 * Your ticket price is : 13.5
 *
 **/

package com.week2.ödev.cinemaTicket;

import java.util.*;

public class CinemaTicket {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double ticketPrice = 15.0;
        byte age;
        int movieNumber;

        // make up a list for movies' name
        HashMap<Integer,String> movies = new HashMap<>();

        // fill the list with kind of movies
        for (int i = 1; i <= 5; i++){
            System.out.print("Theater " + i + " : ");
            movies.put(i, scanner.nextLine().toLowerCase());
        }

        // during this loop we will do our transaction such as; selecting movie type, calculating ticket price
        while(true){

            System.out.println("*********** Movies Type ***********");
            for (Map.Entry<Integer, String> entry : movies.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + " : " + value);
            }
            System.out.println("*********************************");

            System.out.print("Please select your movie type : ");
            movieNumber = scanner.nextByte();

            System.out.print("Please enter your age : ");
            age = scanner.nextByte();

            double totalPrice = 0;
            double discount = 0;


            if(age <= 18){

                if (movies.get(movieNumber).equals("horror")){
                    System.out.println("Your movie is : " + movies.get(movieNumber));
                    discount = ticketPrice * 0.20;
                    totalPrice = ticketPrice - discount;
                    System.out.println("Your ticket price is : " + totalPrice);

                } else {
                    System.out.println("Your movie is : " + movies.get(movieNumber));
                    discount = ticketPrice * 0.10;
                    totalPrice = ticketPrice - discount;
                    System.out.println("Your ticket price is : " + totalPrice);

                }

                break;

            } else if(18 < age && age < 25){

                if (movies.get(movieNumber).equals("horror")){
                    System.out.println("Your movie is : " + movies.get(movieNumber));
                    discount = ticketPrice * 0.10;
                    totalPrice = ticketPrice - discount;
                    System.out.println("Your ticket price is : " + totalPrice);
                    break;
                } else {
                    System.out.println("Your movie is : " + movies.get(movieNumber));
                    discount = ticketPrice * 0.05;
                    totalPrice = ticketPrice - discount;
                    System.out.println("Your ticket price is : " + totalPrice);
                }

                break;

            }  else {
                System.out.println("Error...! Please reentrant your info...");
            }

        }

        scanner.close();

    }

}
