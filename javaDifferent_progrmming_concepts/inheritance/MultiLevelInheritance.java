package javaDifferent_progrmming_concepts.inheritance;


// MultiLevel inheritance
/*
    The process of deriving a class from another derived class is called
        MultiLevel Inheritance.
 */

class SuperClass{
    public void display(){
        System.out.println("This is super class");
    }
}

class SubClass extends SuperClass{
    public void show(){
        System.out.println("This is Sub class");
    }
}

class SubClass1 extends SubClass{
    public void showMore(){
        System.out.println("This is Sub class 1");
    }
}


public class MultiLevelInheritance {
    public static void main(String[] args) {
        new SubClass1().showMore();
        new SubClass1().show();
        new SubClass1().display();

        new SubClass().show();
        new SubClass().display();
    }

}
