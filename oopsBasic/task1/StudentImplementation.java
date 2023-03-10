//Write a Java Program to copy the values from one object to another Object.
package com.knoldus.oopsBasic.task1;

import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;

    Student() {
        inputStudentDetails();
    }

    Student(int rollNumber, String name){
        setRollNumber(rollNumber);
        setName(name);
    }

    //copy constructor
    Student(Student studentObject){
        System.out.println("Copying the values from one object to another using the copy constructor.");
        setRollNumber(studentObject.rollNumber);
        setName(studentObject.name);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public String getName(){
        return(name);
    }

    public int getRollNumber(){
        return(rollNumber);
    }

    //method to print the details
    public void printStudentDetails(){
        System.out.println("Student's roll no : " + getRollNumber());
        System.out.println("Student's name : " + getName());
    }

    //method to input the details by user
    public void inputStudentDetails(){
        Scanner scannerObject =  new Scanner(System.in);
        System.out.println("Enter the student's roll number : ");
        setRollNumber(scannerObject.nextInt());
        System.out.println("Enter the student's name : ");
        setName(scannerObject.next());
    }
}

public class StudentImplementation{
    public static void main(String[] args) {
        Student firstStudentObject = new Student();
        System.out.println("First Student : ");
        firstStudentObject.printStudentDetails();

        Student secondStudentObject = new Student(firstStudentObject);
        System.out.println("Second Student : ");
        firstStudentObject.printStudentDetails();
    }
}
