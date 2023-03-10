package com.knoldus.oopsBasic.task2;

import java.util.Scanner;

class Address {

    private String street;
    private String city;
    private String state;
    private String country;

    Address(){}
    Address(String street, String city, String state, String country){
        setStreet(street);
        setCity(city);
        setState(state);
        setCountry(country);
    }
    public void setStreet(String street){
        this.street = street;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getStreet(){
        return(street);
    }
    public String getCity(){
        return(city);
    }
    public String getState(){
        return(state);
    }
    public String getCountry(){
        return(country);
    }
    //method to input the address of the members
    public void inputAddressDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the street  : ");
        setStreet(scanner.next());
        System.out.println("Enter the city  : ");
        setCity(scanner.next());
        System.out.println("Enter the state  : ");
        setState(scanner.next());
        System.out.println("Enter the country  : ");
        setCountry(scanner.next());
    }
    //method to print the address of the members
    public void printAddressDetails(){
        System.out.println("Street : " + getStreet());
        System.out.println("City : " + getCity());
        System.out.println("Stae : " + getState());
        System.out.println("Country : " + getCountry());
    }
}

class Member {

    private String name;
    private int age;
    private String phoneNumber;
    private Address address = new Address();
    private double salary;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getName(){
        return(name);
    }
    public int getAge(){
        return(age);
    }
    public String getPhoneNumber(){
        return(phoneNumber);
    }
    public Address getAddress(){
        return(address);
    }
    public double getSalary(){
        return(salary);
    }

    //method to print the salary
    public void printSalary(){
        System.out.println("Salary = " + getSalary());
    }

    //method to input the details of the member
    public void inputMemberDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name : ");
        setName(scanner.next());
        System.out.println("Enter the age  : ");
        setAge(scanner.nextInt());
        System.out.println("Enter the phone number  : ");
        setPhoneNumber(scanner.next());
        System.out.println("Enter the address  : ");
        //calling the address' method to input address details
        address.inputAddressDetails();
        System.out.println("Enter the salary  : ");
        System.out.println(scanner.hasNextDouble());
    }
    ///method to print the details of the member
    public void printMemberDetails(){
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Phone number : " + getPhoneNumber());
        System.out.println("Address : " );
        //calling the address' method to print address details
        address.printAddressDetails();
    }
}

class Employee extends Member{
    private String specialization;
    private String department;
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getSpecialization(){
        return(specialization);
    }
    public String getDepartment(){
        return(department);
    }
    //method to input the details of the employee
    public void inputEmployeeDetails(){
        System.out.println("Enter the Employee Details");
        //calling member's method to input member's details
        inputMemberDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the specialization of the manager : ");
        setSpecialization(scanner.next());
        System.out.println("Enter the department of the manager : ");
        setDepartment(scanner.next());
    }
    //method to print the details of the employee
    public void printEmployeeDetails(){
        //calling member's method to print member's details
        printMemberDetails();
        System.out.println("Specialization : " + getSpecialization());
        System.out.println("Department : " + getDepartment());
    }
}

class Manager extends Member{

    private String specialization;
    private String department;

    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getSpecialization(){
        return(specialization);
    }
    public String getDepartment(){
        return(department);
    }
    //method to input managers' details
    public void inputManagerDetails(){
        System.out.println("Enter the Manager Details");
        //calling member's method to input member's details
        inputMemberDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the specialization of the manager : ");
        setSpecialization(scanner.next());
        System.out.println("Enter the department of the manager : ");
        setDepartment(scanner.next());
    }
    //method to print manager's details
    public void printManagerDetails(){
        //calling member's method to print member's details
        printMemberDetails();
        System.out.println("Specialization : " + getSpecialization());
        System.out.println("Department : " + getDepartment());
    }
}

public class MemberImplementation{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.inputEmployeeDetails();
        employee.printEmployeeDetails();
        Manager manager = new Manager();
        manager.inputManagerDetails();
        manager.printManagerDetails();
    }
}
