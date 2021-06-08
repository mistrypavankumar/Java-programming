package mypack;

/* We can import packages in three ways */
//1.
//import pack.HelperClass;

//2.
import pack.*;


public class MainClass {
    public static void main(String[] args) {
        HelperClass helperClass = new HelperClass();
        helperClass.message();

        // Third way of accessing class of another package
        // During this we need not required to import package;
        // pack.HelperClass hc = new pack.HelperClass();
    }
}
