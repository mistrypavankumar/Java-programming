package javaDifferent_progrmming_concepts;

// Access specifiers
/*
    1. public:
        => The variables and methods when declared as public can be accessed by all
            other class.
        => In the concept of inheritance all the subclasses can access public members of
            it's base class.

    2. private:
        => The variables and methods when declared as private can be accessed by the
            class where it is declared but not accessed by other classes.
        =>  In the concept of inheritance all the subclasses are restricted from
            using the private members it's base class.

    3. protected:
        => The variables and method when declared as protected can be accessed by the
            classes which are belonging to the same package.
        => In the concept of inheritance all the subclasses can access the protected members
            of it's base class.
 */



class Demo{
    public int a;
    public void func(){
        System.out.println("public function");
    }

    private int b;
    private void func1(){
        System.out.println("private function");
    }

    protected int c;
    protected void func3(){
        System.out.println("Protected function");
    }
}

public class AccessSpecifiers {
    public static void main(String[] args) {
        Demo demo = new Demo();

        // accessing public variable and function
        demo.a  = 10;
        demo.func();

        // we cannot access private members of a Demo class

        // Accessing protected variable and function
        demo.c = 10;
        demo.func3();
    }
}
