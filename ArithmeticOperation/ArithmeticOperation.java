package com.company;

import java.util.Scanner;

public class ArithmeticOperation {

    public static void performOperation(char symbol){
        Scanner sc = new Scanner(System.in);
        double result = 0;

        System.out.println("Enter 1st and 2nd number: ");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();

        if(symbol == '+')
            result = num1 + num2;
        else if(symbol == '-')
            result = num1 - num2;
        else if(symbol == '*')
            result = num1 * num2;
        else if(symbol == '/')
            result = num1 / num2;
        else if(symbol == '%')
            result = num1 % num2;

        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        boolean isTrue = true;
        while(isTrue){
            System.out.println("\n<<<< Arithmetic Operation >>>>");
            System.out.println("Enter 1 - Add numbers\n"
                            + "Enter 2 - Subtract numbers\n"
                            + "Enter 3 - Multiply numbers\n"
                            + "Enter 4 - Divide numbers\n"
                            + "Enter 5 - Module of numbers\n"
                            + "Enter 6 - To Exit\n"
                            + "Enter your choice:"
            );

            int choice;
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    performOperation('+');
                    break;
                case 2:
                    performOperation('-');
                    break;
                case 3:
                    performOperation('*');
                    break;
                case 4:
                    performOperation('/');
                    break;
                case 5:
                    performOperation('%');
                    break;
                case 6:
                    isTrue = false;
                    System.out.println("*** Thank you for using ***");
                    break;
                default:
                    System.out.println("Please enter valid input...!!");
                    break;
            }
        }
    }
}
