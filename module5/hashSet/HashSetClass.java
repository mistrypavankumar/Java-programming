package com.company.hashSet;

/*
    HashSet:-s
    -> A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
    -> If any item is repeated then it consider it as a single item.
 */


import java.util.HashSet;

class HashsetSampleProgram{
    public void performOperation(){
        HashSet<Integer> number = new HashSet<Integer>();

        number.add(1);
        number.add(5);
        number.add(8);
        number.add(9);

       for (int i = 0; i < 10; i++){
           if (number.contains(i)){
               System.out.println(i + " is contained by this hashset");
           }else{
               System.out.println(i + " is not contained by this hashset");
           }
       }

    }
}

public class HashSetClass {
    public static void main(String[] args){

        //Creating hashset
        HashSet<String> cars = new HashSet<String>();


        //Adding items into hashset
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("BMW");

        System.out.println(cars);

        //Check If an Item Exists
        // If it contains then it return true if not false
        System.out.println(cars.contains("BMW"));

        // Removing items from hashset
        cars.remove("BMW");
        System.out.println(cars);

        // To clear the all elements
        //cars.clear();
        // this method is used to empty the hashset -- Output: []
        //System.out.println(cars);


        // To find the size of hashset
        cars.size();

        // for-each loop to print elements
        for(String x: cars){
            System.out.println(x);
        }


        // Sample program
        HashsetSampleProgram sampleProgram = new HashsetSampleProgram();
        sampleProgram.performOperation();
    }
}
