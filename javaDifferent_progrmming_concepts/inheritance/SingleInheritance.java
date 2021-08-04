package javaDifferent_progrmming_concepts.inheritance;

// Single inheritance
/*
    Whenever a class inherits another class is called as single inheritance.
 */


class SuperClass1{
    public void display(){
        System.out.println("This is super class");
    }
}

class NewSubClass extends SuperClass1{
    public void show(){
        System.out.println("This is Sub class");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        new NewSubClass().show();
        new NewSubClass().display();
    }
}
