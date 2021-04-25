package bubblesort;

public class BubbleSort {

    static int count = 0;

    //function for bubble sort algorithm
    static void bubbleSort(int[] array){
        int arrayLength = array.length;

        int temp = 0;
        for (int i = 0; i < arrayLength; i++){
            for (int j = 1; j < (arrayLength - i);  j++){
                if (array[j - 1] > array[j]){

                    // Swap elements
                    temp = array[j -1];
                    array[j -1] = array[j];
                    array[j] = temp;

                    /* count variable is created to know
                     how many interchanges were taken while sorting
                     */
                    count++;
                }
            }
        }
    }

    static void printArray(int[] array){
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {3,60,50,2,45,320,5};

        System.out.println("Array Before Bubble Sort");
        printArray(array);

        // call bubble sort logic function
        bubbleSort(array);

        System.out.println("\n\nArray After Bubble Sort");
        printArray(array);

        System.out.println("\n\nNumber of interchanges occured: " + count);

    }
}
