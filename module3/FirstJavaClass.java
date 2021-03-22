package com.company;

public class FirstJavaClass {
    public double Area(int a, int b){
        return a * b;
    }

    public void display(String shapeName){
        System.out.print("Area of " + shapeName + ":  ");
    }

    // ============================================>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //Constructor - it is a member function of a class who variable name will be same as class name
    // Constructor is called automatically when an object is created

    // Creating a default constructor
    int x,y,z;
    public FirstJavaClass(){
        System.out.println("Called constructor");
        x = 5;      // initializing value for variable x
    }

    // Creating a constructor with parameter
    public FirstJavaClass(int a, int b){
        y = a;
        z = b;
    }

    // =======================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>

}
