package com.company;

// Modifiers are two types 1. access modifiers and 2. non-access modifiers

//1. Access Modifiers: controlling access level of members of a class
class Modifiers{

    // private :  The code is only accessible within the declared class
    private int x = 10;
    private String  name = "User name";

    // protected : The code is accessible in the same package and subclasses.
    protected int y = 20;
    protected String greeting = "Good Night";

    // Default: The code is only accessible in the same package. If we don't specify any modifiers
    int value = 123;
    String className = "modifiers";

}

//2. Non-Access modifiers:
// final:   which cannot be modified
// abstract class: it is not used to create an object
// abstract function: it doesn't have a body

// creating a abstract class
abstract class AbstractClass{
    final public String firstName  = "Me";
    final public  String lastName = "You";
    public abstract void display();   // abstract function
}

class Student extends AbstractClass{
    // abstract function must be overriden after inheriting
    public void display(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
}

// we can access above class in Main class by extends keyword
public class Main extends Modifiers{

    public static void main(String[] args) {
	// write your code here

        Main obj = new Main();
        System.out.println(obj.y);  // protected variable can be inherited
        System.out.println(obj.greeting);
        System.out.println(obj.value);
        System.out.println(obj.className);

        Student obj1 = new Student();
        obj1.display();
    }
}
