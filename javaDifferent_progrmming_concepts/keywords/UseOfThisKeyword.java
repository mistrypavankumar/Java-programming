package javaDifferent_progrmming_concepts.keywords;

/*
    In java, 'this' keyword is a reference to the variables that refers to the
    current object / class;

    # usage of this keyword
    1. It is used to refer to the current class instance variable.
    2. It can be used to invoke current class methods
    3. this() can be used to invoke current class constructor
    4. It can be passed as an argument in the method call & constructor call.
    5. It can be used to return the current class instance from the method.
 */

class A{
    int rollNo;
    String name;
    int totalMarks;

    A(int rollNo, String name){

        // Accessing current members of the class
        this.rollNo = rollNo;
        this.name = name;
    }

    void getStart(){
        System.out.println("Get Start...");
    }

    A(int rollNo, String name, int marks){
        this(rollNo, name);     // calling current class constructor
        totalMarks = marks;
    }

    void display(){
        // Calling current method of the class
        this.getStart();
        System.out.println("Roll_No: " + rollNo + "\nName: "
                + name  + "\nMarks: " + totalMarks);
    }
}


public class UseOfThisKeyword {
    public static void main(String[] args) {
        new A(581,"Pavan Kumar",86).display();
    }
}
