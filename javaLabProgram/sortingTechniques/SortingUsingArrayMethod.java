package javaLabProgram.sortingTechniques;

import java.util.Arrays;

public class SortingUsingArrayMethod {
    public static void main(String[] args) {
        // Defining an array of type String
        String[] names = {"Pavan", "Kamal", "Sai Teja", "Vamshi", "Rithvik", "Chaitanya"};

        // Before sorting
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(names));

        // Array sorting method
        Arrays.sort(names);

        // After sorting
        System.out.println("\n\nAfter sorting");
        System.out.println(Arrays.toString(names));

    }
}
