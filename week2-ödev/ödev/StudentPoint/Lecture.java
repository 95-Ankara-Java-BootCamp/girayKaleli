package com.week2.ödev.StudentPoint;

public class Lecture {

    double midTermExam;
    double finalExam;

    public double getMidTermExam() {
        return midTermExam;
    }

    public void setMidTermExam(double midTermExam) {
        this.midTermExam = midTermExam;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    public double pointOfExam(double midtermExam, double finalExam){
        double midterm = midtermExam * 0.50;
        double finall = finalExam * 0.70;
        return finall + midterm;
    }
}
