package com.company.abstractClassAndMethod;

// Data abstraction mean hiding data and showing essential data to the user
/*
    abstract class:
    -> For this type of class object cannot be created.
    -> Data members of this class can be accessed by only inheritance and it must be override

    abstract Method:
    -> abstract methods are only used in abstract class
    -> This method is declared in the abstract class without body.
    -> It's body is defined only by inherited class.

 */

// Creating abstract class
abstract class AbstractClass{
    public void display(){
        System.out.println("Write something....");
    }

    //Creating abstract method
    public abstract void printSomething();

}

class InheritedAbstractClass extends AbstractClass{
    @Override
    public void display() {
//        System.out.println("Hello!.....");
        super.display();
    }

    @Override
    public void printSomething() {
        System.out.println("Learning Java");
    }
}

public class AbstractClassAndMethod {
    public static void main(String[] args){
        InheritedAbstractClass inheritedAbstractClass = new InheritedAbstractClass();
        inheritedAbstractClass.display();
        inheritedAbstractClass.printSomething();
    }
}
