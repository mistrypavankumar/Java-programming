package javaDifferent_progrmming_concepts.abstractConcept;


// abstract class and method
/*
    => Both abstract class and methods using the keyword "abstract".
    => The class that doesn't have any body is called abstract class.
    => The method which doesn't have any body is called abstract method.
    => In the subclass all the abstract method must be overriden or implemented.
 */

// Create a abstract class
abstract class DemoAbstractClass{
    abstract void display();        // abstract method will not contain any body
}

class Demo extends DemoAbstractClass{

    // abstract method must be overriden or implemented
    @Override
    void display() {
        System.out.println("This method is overriden by demo class");
    }
}


public class UseOfAbstract {
    public static void main(String[] args) {
        new Demo().display();
    }
}
