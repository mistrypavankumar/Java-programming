package javaDifferent_progrmming_concepts.polymorphism.overloadingConcept;


// Constructor Overloading
/*
    Constructor overloading is same as method overloading but it doesn't return anything.
    Constructor have same name of the class but each of it provides a different definition
    and different number of parameters.
 */

class AreaDemo{
    int num1, num2;

    AreaDemo(){
        System.out.println("Let's learn Constructor overloading");
    }

    AreaDemo(int side){
        this.num1 = side;
    }

    AreaDemo(int length, int width ){
        // this() -->  it will work as calling a constructor and passing parameter
        this(length);
        this.num2 = width;
    }

    void getAreaOfSquare(){
        int area = 4 * num1;
        System.out.println("Area of Square: " + area);
    }

    void getAreaOfRectangle(){
        int area = num1 * num2;
        System.out.println("Area of Rectangle: " + area);
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        new AreaDemo();
        new AreaDemo(5).getAreaOfSquare();
        new AreaDemo(2,5).getAreaOfRectangle();
    }
}
