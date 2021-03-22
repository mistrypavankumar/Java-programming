package com.company.functionBasic;

public class FunctionBasic {
    // static means this function is not an object of this class
    static void display(){
        System.out.println("Hello Java");
    }

    static int addNumbers(int num1, int num2){
        return (num1 + num2);
    }

    // method overloading
    static int area(int side){
        return side * side;
    }

    static int area(int lenght, int width){
        return lenght * width;
    }

    static double area(double radius){
        return (4 * 3.14 * radius * radius);
    }

    // Recursion
    static int findFactorial(int num){
        int fact = 1;
        if(num == 0 || num == 1){
            return fact;
        }else{
            return num * findFactorial(num - 1);
        }
    }

    public static void main(String[] args) {
        // write your code here
        display();
        display();
        display();

        System.out.println("sum: " + addNumbers(12,14));

        System.out.println(area(12));
        System.out.println(area(12,10));
        System.out.println(area(2.5));

        System.out.println("factorial: "  + findFactorial(3));
    }
}
