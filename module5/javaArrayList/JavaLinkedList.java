package com.company.javaArrayList;

import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args){

        LinkedList<String> cars = new LinkedList<String>();

        // Adding items
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("BMW");

        // Same operation will be there as like in arrayList

        //In linked list we can add items
        cars.addFirst("Ford");
        cars.addLast("Hundai");

        for (String i :
                cars) {
            System.out.println(i);
        }

        // In linked list we can remove items
        cars.removeFirst();
        cars.removeLast();

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        // In linked list we can get items
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

    }
}
