package com.company.javaIterator;

/*
    Iterator Method:-
    -> An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
    -> It is called an "iterator" because "iterating" is the technical term for looping.
    -> To use an Iterator, we must import it from the java.util package.
 */


import java.util.HashSet;
import java.util.Iterator;

public class IteratorClass {
    public static void main(String[] args){
        HashSet<Integer> hashSet = new HashSet<Integer>();

        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(15);
        hashSet.add(6);

        // Get the iterator
        Iterator<Integer> iterator = hashSet.iterator();

        // Accessing all the element using iterator
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Removing elements using iterator
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if(i < 10){
                iterator.remove();  // here it remove elements which are less than 10
            }else{
                System.out.println(i);   // here it will print the elements which are not less than 10
            }
        }


        /*
                                        <<<< Important >>>>
        Trying to remove items using a for loop or a for-each loop would not work correctly
        because the collection is changing size at the same time that the code is trying to loop.
         */
    }
}
