package com.company.interfaceClass;

/*
    interface:
    -> Like abstract classes, interfaces cannot be used to create objects.
    -> Interface methods do not have a body - the body is provided by the "implement" class
    -> On implementation of an interface, you must override all of its methods.
    -> Interface methods are by default abstract and public.
    -> Interface attributes are by default public, static and final.
    -> An interface cannot contain a constructor (as it cannot be used to create objects)
 */

//Creating interface class
interface interface_Class{
    public int addTwoNumber(int a, int b);
    public void printOutput(int result);
}

// we use implements keyword to access interface class
class Area implements interface_Class{
    @Override
    public int addTwoNumber(int a, int b) {
        return a + b;
    }

    @Override
    public void printOutput(int result){
        System.out.println("Sum = " + result);
    }
}


// In abstract class we cannot perform multiple inheritance
// But in interface class we can perform multiple inheritance by separating with comma

interface FirstClass{
    public void firstMethod();
}

interface SecondClass{
    public void secondMethod();
}

class ThirdClass implements FirstClass, SecondClass {
    @Override
    public void firstMethod(){
        System.out.println("First method");
    }

    @Override
    public void secondMethod(){
        System.out.println("Second method");
    }
}

public class InterfaceClass {
    public static void main(String[] args){
        Area area = new Area();
        int c = area.addTwoNumber(2,4);
        area.printOutput(c);


        ThirdClass thirdClass = new ThirdClass();
        thirdClass.firstMethod();
        thirdClass.secondMethod();
    }
}
