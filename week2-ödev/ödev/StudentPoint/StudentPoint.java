/**
 *
 * @author Guray Kaleli,2021
 *
 * @return to calculate student's midterm exams(%50) and final exams(%70) and decide who is passed or failed
 *
 **/


package com.week2.ödev.StudentPoint;

import java.util.Scanner;

public class StudentPoint {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your id - name - lecture: ");
        Student student = new Student();
        Lecture lecture = new Lecture();

        student.setId(1);
        student.setName("Ali");
        student.setLectureName("Mat");
        lecture.setMidTermExam(10);
        lecture.setFinalExam(10);
        student.setPoint(lecture.pointOfExam(lecture.getMidTermExam(),lecture.getFinalExam()));

        System.out.print("Name: ");
        student.setName(scanner.nextLine());
        System.out.print("Lecture: ");
        student.setLectureName(scanner.nextLine());
        System.out.print("ID: ");
        student.setId(scanner.nextInt());



        System.out.println("Please enter your exams points: ");
        for (int i = 0; i < 1; i++){
            System.out.print("Midterm result: ");
            lecture.setMidTermExam(scanner.nextDouble());
            System.out.print("Final result: ");
            lecture.setFinalExam(scanner.nextDouble());
        }


        double avragePoints = student.getPoint();
        System.out.println("Your average point : " + avragePoints);

        if(avragePoints >= 0 && avragePoints < 20)
        {
            student.info();
            System.out.print("FF");
        }
        else if(avragePoints >= 20 && avragePoints < 50)
        {
            System.out.print("CB");
        }
        else if(avragePoints >= 50 && avragePoints < 70)
        {
            System.out.print("BB");
        }
        else if(avragePoints >= 70 && avragePoints < 100)
        {
            System.out.print("AA");
        }
        else if(avragePoints>=75 && avragePoints<=80)
        {
            System.out.print("BC");
        }
        else
        {
            System.out.print("Error.....");
        }

        scanner.close();

    }

}
























