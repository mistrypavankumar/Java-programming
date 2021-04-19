package javaLabProgram.sortingTechniques;

// import java.util.Arrays;

public class UserDefinedArraySorting {

    static void displayStringArray(String content,String[] array){

        System.out.println(content);
        for (String values: array) {
            System.out.print("[ "+ values + " ]");
        }
    }

    public static void main(String[] args) {
        // Defining an array of type String
        String[] names = {"Pavan", "Kamal", "Sai Teja", "Vamshi", "Rithvik", "Chaitanya"};

        // Array before sorting
        displayStringArray("Before Sorting", names);

        // Logic for sorting
        for (int i = 0; i < names.length; i++){
            for (int j = i + 1; j < names.length; j++){
                if (names[i].compareToIgnoreCase(names[j]) > 0){

                    // As condition satisfies then we will s
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // After sorting
        // System.out.println(Arrays.toString(names));    //This is used to print list of array in the form of array

       displayStringArray("\n\nAfter sorting: ", names);
    }
}
