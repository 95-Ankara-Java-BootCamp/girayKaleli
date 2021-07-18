package com.week2.ödev.StudentPoint;

public class Student {

    private int id;
    private String name;
    private String lectureName;
    private double point;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public void info(){
        System.out.println(getId() + " " + getName() + " " + getLectureName());
    }
}
