package com.company.multipleInheritance;

interface A{
    void display();
    default void show(){
        System.out.println("This is default message from A interface");
    }
}

interface B{
    void display2();
    default void show(){
        System.out.println("This is default message from B interface");
    }
}

class DemoMultipleInheritance implements A,B{
    @Override
    public void display() {
        System.out.println("Displaying content after overriding of A interface");
    }

    @Override
    public void display2() {
        System.out.println("Displaying content after overriding of B interface");
    }

    @Override
    public void show() {
        A.super.show();
        B.super.show();
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        new DemoMultipleInheritance().display();
        new DemoMultipleInheritance().display2();
        new DemoMultipleInheritance().show();
    }
}
