package javaDifferent_progrmming_concepts;

class OuterClass{
    static int sid = 5;

    // Inner class should be static in order to use it
    static class InnerClass{
        public void innerMethod(){
            System.out.println("This is inner method");
            System.out.println("Student id: " + sid);
        }
    }
}
public class NestedClass {
    public static void main(String[] args) {
        new OuterClass.InnerClass().innerMethod();
    }
}
