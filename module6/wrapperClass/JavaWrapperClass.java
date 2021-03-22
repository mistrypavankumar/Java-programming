package com.company.wrapperClass;

/*
    Wrapper class:-
    -> Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
    byte   ---------> Byte
    short  ---------> Short
    int    ---------> Integer
    long   ---------> Long
    float  ---------> Float
    double ---------> Double
    boolean --------> Boolean
    char    --------> Character

 */

public class JavaWrapperClass {
    public static void main(String[] args){

        // Creating wrapper class object
        Integer myInt = 100;
        Double myDouble = 10.3;
        Character myChar = 'M';

        System.out.println(myInt.intValue());
        System.out.println(myDouble);
        System.out.println(myChar);

        //converting into string
        String myString = myInt.toString();
        System.out.println(myString.length());
    }
}
