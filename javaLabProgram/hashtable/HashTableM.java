package com.company;

import java.io.*;
import java.util.*;


public class HashTableM {
    public static void main(String[] args) {
        try {
            // path should be absolute path of the file ph.txt
            FileInputStream fs = new FileInputStream("C:\\Users\\pavan\\IdeaProjects\\javalab\\src\\com\\company\\ph");
            Scanner sc = new Scanner(fs).useDelimiter("\\s+");

            // Hashtable object
            Hashtable<String, String> ht = new Hashtable<String,String>();

            String[] arrayList;
            String a;

            System.out.println("<<<<<<<<<< HASHTABLE >>>>>>>>>>>>>");
            System.out.println("");
            System.out.println("KEY : VALUES");

            while(sc.hasNext()){
                a = sc.nextLine();

                arrayList = a.split("\\s+");
                ht.put(arrayList[0],arrayList[1]);
                System.out.println( arrayList[0] + " : " + arrayList[1]);
            }

            System.out.println(">>>> MENU <<<<");
            System.out.println(">> 1: Search by Name");
            System.out.println(">> 2: Search by Mobile number");
            System.out.println(">> 3: Exit");

            int option = 0;
            String name, mobileNumber;

            Scanner input = new Scanner(System.in);

            while(option!= 3){
                System.out.println("Enter your option (1/2/3): ");
                option = input.nextInt();

                switch (option){
                    case 1: {
                        System.out.println("Enter Name: ");
                        name = input.next();

                        if (ht.containsKey(name))
                            System.out.println("Mobile Number is: " + ht.get(name));
                        else
                            System.out.println("Not found");
                    }
                    break;

                    case 2:{
                        System.out.println("Enter Mobile Number: ");
                        mobileNumber = input.next();

                        if (ht.containsValue(mobileNumber)){
                            for (@SuppressWarnings("rawtypes")Map.Entry e: ht.entrySet()){
                                if (mobileNumber.equals(e.getValue()))
                                    System.out.println("Name is : " + e.getKey());
                            }
                        }else
                            System.out.println("Not found");
                    }
                    break;

                    case 3:
                        System.out.println("Menu Successfully Exited");
                    break;

                    default:
                        System.out.println("Choose options between 1 and 3");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
