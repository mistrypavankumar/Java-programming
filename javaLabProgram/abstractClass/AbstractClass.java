package com.company;

/*

Write a Java program to create an abstract class named Shape that contains two integers and an
empty method named print Area (). Provide three classes named Rectangle, Triangle, and Circle
such that each one of the classes extends the class Shape. Each one of the classes contains only
the method print Area () that prints the area of the given shape.
 */

abstract class Shape{
    int radius, length, width, base,height;
    abstract void printArea(int length, int width);
}

class Rectangle extends Shape {
    @Override
    void printArea(int length, int width) {
        this.length = length;
        this.width = width;

        System.out.println("Rectangle area: "  + (this.length * this.width));
    }
}

class Triangle extends Shape{
    @Override
    void printArea(int length, int width) {
        this.base = length;
        this.height = width;

        System.out.println("Triangle area: " + (0.5 * base * height));
    }
}

class Circle extends Shape{
    @Override
    void printArea(int length, int width) {
        this.radius = length;
        this.radius = width;

        System.out.println("Circle area: " + (3.14 * radius * radius));
    }
}

public class AbstractClass{

    public static void main(String[] args) {
	// write your code here

        Rectangle rectangle = new Rectangle();
        rectangle.printArea(12,10);

        Triangle triangle = new Triangle();
        triangle.printArea(12,10);

        Circle circle = new Circle();
        circle.printArea(12,12);

    }
}
