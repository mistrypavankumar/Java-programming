package javaTask;

import java.util.Scanner;

class Constructor{
    int length, width, side;
    double radius;
    
    // Constructor overloading 
    
    //Type-1: Default constructor
    Constructor(){
        System.out.print("Let's find the area of Shapes\n\n");
    }
    
    //Type-2
    Constructor(int side){
        this.side = side;
    }
    
    //Type -3
    Constructor(double radius){
        this.radius = radius;
    }
        
    //Type-4: 
    Constructor(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getAreaOfSquare(){
        return side * side;
    }

    public int getAreaOfRectangle(){
        return length * width;
    }

    public double getAreaOfCircle(){
        return 2 * 3.14 * radius;
    }
}

public class JavaConstructor {
    public static void main(String[] args) {
        boolean isTrue = true;

        while (isTrue){
            Constructor area = new Constructor();
            
            System.out.println("Enter 1 - to Find area of Square\n" +
                    "Enter 2 - to Find area of rectangle\n" +
                    "Enter 3 - to Find area of circle\n" +
                    "Enter 4 - to exit");

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your choice: ");

            int user = input.nextInt();
            switch (user){
                case 1: {
                    System.out.println("Enter first Number: ");
                    int num1 = input.nextInt();

                    Constructor area = new Constructor(num1);
                    System.out.println("Area of Square = " + area.getAreaOfSquare() + "\n\n");
                }
                break;
                case 2: {
                    System.out.println("Enter fist Number: ");
                    int num1 = input.nextInt();

                    System.out.println("Enter second Number: ");
                    int num2 = input.nextInt();

                    Constructor area = new Constructor(num1, num2);
                    System.out.println("Area of rectangle = " + area.getAreaOfRectangle() + "\n\n");
                }
                break;
                case 3:{
                    System.out.println("Enter radius of circle: ");
                    double radius = input.nextInt();

                    Constructor area = new Constructor(radius);
                    System.out.println("Area of Square = " + area.getAreaOfCircle() + "\n\n");
                }
                case 4: {
                    isTrue = false;
                    break;
                }
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
