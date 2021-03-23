package com.company.basicJava;

import java.util.Scanner;

public class IntroToJava {

    public static void main(String[] args) {
        // write your code here
        // to print on the terminal
        System.out.println("Hello World");

        // to take input from user we use
        Scanner input = new Scanner(System.in);  // import java.util.Scanner to use this
        System.out.println("Enter a number");
        int a = input.nextInt();

        // This is single line comment

        /* This is
            multi-line
            comment
         */


        // variable rules
        /*
            1. A variable name can start with $, _ or a letter but not with number. we can user numbers in between.
            2. Variable name should not contain any white space in between
            3. Variables are case sensitive  ex: variable , Variable  both are different
            4. Variables name should be descriptive for making code more readable
         */
        String studentName = "Pavan Kumar";
        String _studentName = "Meghana";
        String $studentName = "Sony";



        // data-types
        int number = 10;
        float floatingPointNumber = 12.4f;
        double doubleNumber = 12.4;
        char character = 'M';
        String StringData = "This is a string";
        boolean booleanType  = true;  // false

        // Type casting
        int $integer  = 10;
        double $double = $integer; // this is converted by compiler

        System.out.println($integer);
        System.out.println($double);

        int $integer1 = (int)$double; // this conversion is done by user
        System.out.println($integer1);



        // =================================================>>>>>>>>
        // String Methods
        String word1 = "Hello-";
        String word2 = "World";

        // to concatinate we can use + operator or concat() function
        System.out.println(word1 + word2);
        System.out.println(word1.concat(word2));

        // to find the lenght of the string
        System.out.println(word1.length());

        // to replace a string
        System.out.println(word1.replace("H", "J"));

        // to upper-case and lower-case a string
        System.out.println(word2.toLowerCase());
        System.out.println(word1.toUpperCase());

        // to check weather the string is empty or not
        System.out.println(word1.isEmpty());

        // to find the index of particular string
        String someString = "This is a sting of something";
        System.out.println(someString.indexOf("a"));

        // to remove white space from end and starting
        String stringWithWhiteSpace = "    this is a sting with white space     ";
        System.out.println(stringWithWhiteSpace.trim());

        // to split a string as an array with a particular character
        String splitThisText = "split";
        System.out.println(splitThisText.split(" - "));

        // to compare two string we use compareTo() function
        String string1 = "This is one string";
        String string2 = "This is one String";

        // For this output will be 0 if it matches if not some integer value comes
        // This is case sensitive
        System.out.println(string1.compareTo(string2));

        // to compare without case sensitive we use compareToIgnoreCase() function
        System.out.println(string1.compareToIgnoreCase(string2));


        // control statements
        int num1 = 10, num2 = 10;
        if (num1 > num2){
            System.out.println("num1 is greater than num2");
        }else if (num1 < num2){
            System.out.println("num2 is greater than num1");
        }
        else{
            System.out.println("num1 is equal to num2");
        }

        // switch statements
        int user = input.nextInt();
        switch (user){
            case 1:
                System.out.println("case 1 value =  " + user);
                break;
            case 2:
                System.out.println("case 2 value =  " + user);
                break;
            default:
                System.out.println("Enter only a number");
        }


        // loop statements
        int i = 0;
        while(i < 10){
            System.out.println("Let's ");
            i++;
        }

        // in do-while  once the code get execute without checking condition
        int j = 0;
        do {
            System.out.println("Hello");
            j++;
        }while (j < 9);


        for ( i = 0; i < 10; i++){
            System.out.println("Java");
        }


        // Array - it is a collection of similar data types
        String[] cars = {"Volvo", "BMW", "Ford"};

        int[] arrayOfInteger = {12,23,34,45,46};

        // accessing elements of an array
        // Method - 1:
        System.out.println(cars[0]);  // access by using index

        // Method -2: for loop
        for (i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        // Method 3: for-each
        for (String x : cars){
            System.out.println(x);
        }


        // changing value with the help of index
        cars[0] = "Audi";
        System.out.println(cars[0]);


        // Multi-Dimensional array
        int[][] multiArray = {{1,2,3,4},{5,6,7,8}};

        for (i = 0; i < multiArray.length; i++){
            for (j = 0; j < multiArray[i].length; j++){
                System.out.print(multiArray[i][j] + " ");

                if (j == multiArray[i].length - 1){
                    System.out.println();
                }
            }
        }


    }
}
