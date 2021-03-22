package com.company.hashMap;

import java.util.Collections;
import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args){


        //HashMap : It is same as an arrayList but it stores key/value pairs

        //Creating hashmap
        HashMap<String, String> hashMap = new HashMap<String, String>();


        //Adding items into hashmap
        hashMap.put("Englond","London");
        hashMap.put("Germany","Berlin");
        hashMap.put("Norway","Oslo");


        // Getting items from hashMap
        hashMap.get("Englond");
        System.out.println(hashMap.get("Germany"));

        //printing only keys
        for (String i: hashMap.keySet()
             ) {
            System.out.println(i);
        }

        // printing only values
        for (String i: hashMap.values()){
            System.out.println(i);
        }

        // printing all elements of an hashmap
        for (String i: hashMap.keySet()){
            System.out.println("Key:  " + i + " and " + hashMap.get(i));
        }
    }
}
