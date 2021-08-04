package javaDifferent_progrmming_concepts.overloadingConcept;

// Method overloading:
/*
    A function or method which having same method name but different arguments
    and different definitions is called method overloading.

    Compiler does not get confused when it is called because it matches
    -> method name
    -> number of arguments
    -> type of arguments
 */

class Area{
    int area;

    void findArea(int side){
        area = 4 * side;
        System.out.println("Area of Sqaure: " + area);
    }

    void findArea(int length, int width){
        area = length * width;
        System.out.println("Area of Rectangle:  " + area);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        new Area().findArea(5);
        new Area().findArea(2,5);
    }
}
