package tasks;

import java.util.Scanner;

public class FindLargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("<<<< Find largest number >>>>");

        int numbers = 5;
        int arr[] = new int[numbers];
        int max;

        System.out.println("Enter your " + numbers + " numbers:");
        for (int i = 0; i < numbers; i++){
            System.out.print("Enter " + "[" + i + "]" + ": ");
            arr[i] = input.nextInt();
            System.out.println();
        }

        max = arr[0];

        for (int i = 0; i < numbers; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Largest Number is: " + max);

    }
}
