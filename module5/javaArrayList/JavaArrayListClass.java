package com.company.javaArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayListClass {
    public static void main(String[] args){

        // ArrayList: It is a resizeable array, which is in java.util package

        //Creation of ArrayList
        ArrayList<String> cars  = new ArrayList<String>();

        // Adding items into the list
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Audi");

        // Accessing items of ArrayList
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));

        System.out.println("After changing items");
        // Changing items of ArrayList
        cars.set(0, "Ford");
        cars.set(2, "Volvo");

        // Accessing items of ArrayList
        System.out.println(cars.get(0));
        System.out.println(cars.get(2));

        // removing items from ArrayList
        cars.remove(0);
        cars.remove(1);

        System.out.println("After removing items");
        System.out.println(cars.get(0));

        //cars.clear();    // this is used to clear arrayList completely

        // Finding size of arraylist
        System.out.println("Size of an arrayList: ==> " + cars.size());


        // loop through an arraylist
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("Ford");

        //using for loop
        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        // using for-each loop to access all elements of arrayList
        for(String i: cars){
            System.out.println(i);
        }

        System.out.println("After sorting the elements");
        // to sort the arrayList element we use collections package
        Collections.sort(cars);
        for (String x :
                cars) {
            System.out.println(x);
        }

    }
}
