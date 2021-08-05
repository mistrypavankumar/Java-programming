package javaDifferent_progrmming_concepts.polymorphism.overridingConcept;

// Method overriding
/*
    => It is a phenomenon in which a method in subclass is similar to the method in superclass.
    => The return type and signature of a subclass matches with the return type and signature of
    the superclass method.
    This method can be used for runtime polymorphism.

    Rules to be followed for method overriding
    1. The argument list of subclass method and superclass method must be same.
    2. The access modifier of subclass method must not restrict the superclass method.
    3. Static and final method must not be overriden.
    4. Constructor and method which cannot be inherited cannot be overriden.
 */

class Demo{
    void show(){
        System.out.println("This is demo class");
    }
}

class SubDemo extends Demo{

    // This is overriding the extended method of a class Demo
    void show(){
        System.out.println("This is sub demo class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Demo d = new SubDemo();
        d.show();
    }
}
