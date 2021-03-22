package com.company.innerclass;

// nested class
class OuterClass{
    public void callOuterFunc(){
        System.out.println("Called outer function");
    }

    class InnerClass{
        public void callInnerFunc(){
            System.out.println("Called Inner function");
            callOuterFunc();   // Accessing outerClass members in innerClass
        }
    }

    // inner class can be private/protected also
    private class InnerClass1{
        int x = 5;
    }

    protected class InnerClass2{
        int y  = 10;
    }

    // Static innerclass:
    // This class will be accessed without creating object of outer class
    static class InnerClass3{
        public void dis(){
            System.out.println("This is called from static class");
        }
    }
}


public class NestedClass {
    public static void main(String[] args){

        // Creating object for outer class
        OuterClass outerClass = new OuterClass();
        outerClass.callOuterFunc();

        // Creating object for inner class
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.callInnerFunc();

        // This is the way of creating object of static class without object of Outerclass
        OuterClass.InnerClass3  innerClass3 = new OuterClass.InnerClass3();
        innerClass3.dis();
    }
}
