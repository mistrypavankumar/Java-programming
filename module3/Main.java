package com.company;

// Below code a class with name Main
public class Main {

        // Attributes
        int x = 10;    // here x is said to be attribute of a class
        int y;

        final double PI = 3.14;     // final keyword used to create a constant variable
        // By using final keyword before data type, make's it unchangeable variable

        String firstName = "Pavan ";
        String lastName = "Kumar";

        // =======================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        // Class Methods
        //1. static method which will be directly called without creating an object
        static public void myFunction(String name){
            System.out.println("My name is " + name);
        }

        //2. Public method which will be accessed by an object
        public void display(){
            System.out.println("This is a public function");
        }


    public static void main(String[] args) {
	// write your code here

        // Creating object of Main class
        Main objectName = new Main();

        // Creating multiple objects
        Main objectName1 = new Main();
        Main objectName2 = new Main();

        // modifying the attributes
        objectName1.y = 20;
        objectName.x = 50;

        System.out.println(objectName.x);
        System.out.println(objectName1.y);

        System.out.println("First Name: " + objectName2.firstName + "\n" + "Last Name: " + objectName2.lastName);


        // ====================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // class Method related calls
        myFunction("Pavan Kumar");      // way of calling static method

        Main callFunction = new Main();
        callFunction.display();     // way of calling public method


        // =======================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // Multiple class
        FirstJavaClass firstJavaClass = new FirstJavaClass();
        double area = firstJavaClass.Area(2,5);
        firstJavaClass.display("Rectangle");
        System.out.print(area);     // by writing only print new line is not creates

        // =======================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    }
}
