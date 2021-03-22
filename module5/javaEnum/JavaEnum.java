package com.company.javaEnum;


/*
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
 */
enum level{
    Low,
    Medium,
    High
}

public class JavaEnum {
    public static void main(String[] args){
        level myVar = level.Medium;

        switch (myVar){
            case Low:
                System.out.println("Low");
                break;
            case Medium:
                System.out.println("Medium");
                break;
            case High:
                System.out.println("High");
                break;
            default:
                System.out.println("invalid option");
        }

        // we can use for-Each loop for emun class
        for (level myLevel : level.values()){
            System.out.println(myLevel);
        }
    }
}
