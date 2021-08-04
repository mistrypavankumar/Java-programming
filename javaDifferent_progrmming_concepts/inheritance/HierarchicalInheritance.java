package javaDifferent_progrmming_concepts.inheritance;

// Hierarchical Inheritance:
/*
    Whenever two or more classes inherits a single class is called Hierarchical Inheritance.
 */

class Animal{
    public void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Barking...");
    }
}

class Cat extends Animal{
    public void meow(){
        System.out.println("Meow...");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        new Cat().meow();
        new Cat().eat();

        new Dog().bark();
        new Dog().eat();
    }
}
