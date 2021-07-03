package com.week1.ödev.studentGrades;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many lecture do you have in semester: ");
        int lectureNumb = scanner.nextInt();

        int[] points = new int[lectureNumb];
        double total = 0D;
        double avragePoints = 0D;

        for(int i = 0; i < points.length; i++){
            System.out.print("Enter your lecture points : " );
            points[i] = scanner.nextInt();
            total = total + points[i];
        }

        scanner.close();

        avragePoints =  total / lectureNumb;

        System.out.println("Your average is : " + avragePoints);

        System.out.print("Your grade is : " );

        if(avragePoints>=95)
        {
            System.out.print("AA");
        }
        else if(avragePoints>=90 && avragePoints<=95)
        {
            System.out.print("BA");
        }
        else if(avragePoints>=85 && avragePoints<=90)
        {
            System.out.print("BB");
        }
        else if(avragePoints>=80 && avragePoints<=85)
        {
            System.out.print("BB");
        }
        else if(avragePoints>=75 && avragePoints<=80)
        {
            System.out.print("BC");
        }
        else if(avragePoints>=70 && avragePoints<=75)
        {
            System.out.print("CC");
        }
        else if(avragePoints>=70 && avragePoints<=60)
        {
            System.out.print("CD");
        }
        else if(avragePoints>=50 && avragePoints<=60)
        {
            System.out.print("DD");
        }
        else if(avragePoints>=45 && avragePoints<=50)
        {
            System.out.print("DF");
        }
        else
        {
            System.out.print("FF");
        }



    }

}
