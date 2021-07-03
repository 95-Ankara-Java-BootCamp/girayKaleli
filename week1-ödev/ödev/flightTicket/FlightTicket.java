package com.week1.ödev.flightTicket;

import java.util.Scanner;

public class FlightTicket {

    public static void main(String[] args){

        // get scanner instance for user input
        Scanner scanner = new Scanner(System.in);

        // define our variables
        int age, modeOfTravel, km;
        double perKm = 0.10;
        boolean dataCheck = true;
        double normalPrice, ageDiscount, discountPrice, returnTicketDiscount, totalPrice;

        while(dataCheck){

            System.out.print("Please select your mode of travel : \n"
                    + " 1 - One Way Ticket\n"
                    + " 2 - Round Trip Ticket\n");
            modeOfTravel = scanner.nextInt();

            System.out.print("Please enter your age : ");
            age = scanner.nextInt();

            System.out.print("Please enter how many kilometers your way is : ");
            km = scanner.nextInt();

            if(!((modeOfTravel == 1) || (modeOfTravel == 2)) || (km < 0)){

                System.out.println("You Entered Wrong Data!!!\nPlease try again!");
                dataCheck = true;

            } else {

                dataCheck = false;

                normalPrice = perKm * km;

                switch (modeOfTravel) {

                    case 1:

                        if (age < 12) {

                            ageDiscount = normalPrice * 0.50;
                            discountPrice = normalPrice - ageDiscount;
                            totalPrice = discountPrice;
                            System.out.println("Total cost : " + totalPrice);

                        } else if (age >= 12 && age <= 24) {

                            ageDiscount = normalPrice * 0.10;
                            discountPrice = normalPrice - ageDiscount;
                            totalPrice = discountPrice;
                            System.out.println("Total cost : " + totalPrice);

                        } else if (age >= 65){

                            ageDiscount = normalPrice * 0.30;
                            discountPrice = normalPrice - ageDiscount;
                            totalPrice = discountPrice;
                            System.out.println("Total cost : " + totalPrice);

                        } else {

                            totalPrice = normalPrice;
                            System.out.println("Total cost : " + totalPrice);

                        }

                        break;

                    case 2:

                        if (age < 12) {

                            ageDiscount = normalPrice * 0.50;
                            discountPrice = normalPrice - ageDiscount;
                            returnTicketDiscount = discountPrice * 0.20;
                            totalPrice = (discountPrice - returnTicketDiscount) * 2;
                            System.out.println("Total cost : " + totalPrice);

                        } else if (age >= 12 && age <= 24) {

                            ageDiscount = normalPrice * 0.10;
                            discountPrice = normalPrice - ageDiscount;
                            returnTicketDiscount = discountPrice * 0.20;
                            totalPrice = (discountPrice - returnTicketDiscount) * 2;
                            System.out.println("Total cost : " + totalPrice);

                        } else if(age >= 65){

                            ageDiscount = normalPrice * 0.30;
                            discountPrice = normalPrice - ageDiscount;
                            returnTicketDiscount = discountPrice * 0.20;
                            totalPrice = (discountPrice - returnTicketDiscount) * 2;
                            System.out.println("Total cost : " + totalPrice);

                        }else {

                            totalPrice = normalPrice * 2;
                            System.out.println("Total cost : " + totalPrice);
                        }

                        break;

                    default:

                        System.out.println("Error on System...");

                }

            }





        }


    }

}



