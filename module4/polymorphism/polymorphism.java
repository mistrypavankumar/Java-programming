package com.company.polymorphism;

import org.w3c.dom.ls.LSOutput;

// super class
class Animal{
    public void animalSound(){
        System.out.println("The animals make a sound");
    }
}

//sub class-1
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

//sub class-2
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: bow bow");
    }

}

public class polymorphism {
    public static void main(String[] args){
        Animal animal = new Animal();
        Dog Dog = new Dog();
        Pig Pig = new Pig();

        animal.animalSound();
        Dog.animalSound();
        Pig.animalSound();

    }
}
