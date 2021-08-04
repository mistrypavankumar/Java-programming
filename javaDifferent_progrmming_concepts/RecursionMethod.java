package javaDifferent_progrmming_concepts;

// Recursion Method
/*
    => It is a process or technique by which a function call itself.
    => A recursion method contains a statement within it's body, which calls the
        same method. Thus, it is also called as circular definition.

        Advantages:
        1. Recursion solves the problem in the most general way as possible.
        2. It is used to solve complicated problems that have repetitive structure.

        Disadvantages:
        1. Usage of recursive incurs overhead, since this technique is implemented
            using function call.
        2. Whenever a recursive call is made, some of the systems memory is consumed.
 */


public class RecursionMethod {

    static int findFactorialOf(int num){
        int result;

        if(num == 1 || num == 0)
            return 1;

        result = findFactorialOf(num - 1) * num;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + findFactorialOf(5));
    }
}
