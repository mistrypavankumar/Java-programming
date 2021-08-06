package com.company.exceptionHandling;

import java.util.Scanner;

public class JavaException {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        try{
            int division = num1 / num2;
            System.out.println("Division of "+  num1 + "/" + num2 + " = " + division);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }

        System.out.println("Rest of the code...");
    }
}
