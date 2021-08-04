package javaDifferent_progrmming_concepts.constructor;

class TypesOfConstructor{

    static int num;

    // Default constructor
    /*
       => Default constructor doesn't take any argument.
       => If no constructor is specified then a default constructor is called automatically.
     */
    TypesOfConstructor(){
        System.out.println("This is default constructor");
    }


    // Parameterized constructor
    /*
        => A constructor which takes arguments as it's parameters is called
            parameterized constructor.
     */

    TypesOfConstructor(int value){
        num = value;
    }

    public void display(){
        System.out.println("Result: " + num);
    }

}

public class DifferentTypesOfConstructor {
    public static void main(String[] args) {
        new TypesOfConstructor();
        new TypesOfConstructor(10).display();
    }
}
