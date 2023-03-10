//Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
// It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the
// same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively.
// Call the method by creating an object of each of the three classes.
package com.knoldus.oopsBasic.task3;

class Degree{
    public void getDegree(){
        System.out.println("I got a degree.");
    }
}

class Undergraduate extends Degree{
    public void getDegree(){
        System.out.println("I am an Undergraduate.");
    }
}

class Postgraduate extends Degree{
    public void getDegree(){
        System.out.println("I am a Postgraduate.");
    }
}


public class DegreeImplementation {
    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getDegree();
        Undergraduate undergraduate = new Undergraduate();
        undergraduate.getDegree();
        Postgraduate postgraduate = new Postgraduate();
        postgraduate.getDegree();
    }

}
