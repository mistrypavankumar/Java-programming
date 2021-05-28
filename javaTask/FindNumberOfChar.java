package tasks;

import java.util.Scanner;

public class FindNumberOfChar {
    static int numberOfCharacters = 0;
    public static void findNumberOfChar(String string){
        for (int i = 1; i <= string.length(); i++){
            numberOfCharacters = i;
        }
    }

    public static void displayNumberOfCharacters(){
        System.out.println("Number of characters in your String is: " + numberOfCharacters);
    }
    public static void main(String[] args) {
        Scanner getString = new Scanner(System.in);
        System.out.println("<<<<< Find number of characters in a string >>>>>");

        System.out.println("Enter your string: ");
        String string = getString.nextLine();

        findNumberOfChar(string);
        displayNumberOfCharacters();

    }
}
