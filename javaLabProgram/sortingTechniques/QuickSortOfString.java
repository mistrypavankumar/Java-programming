package javaLabProgram.sortingTechniques;

public class QuickSortOfString {

    private static int partition(String[] stringArray, int left, int right) {
        String pivotValue = stringArray[left];
        while (left < right) {
            String value1;
            String value2;
            while ((value1 = stringArray[left]).compareToIgnoreCase( pivotValue ) < 0) {
                left = left + 1;
            }
            while ((value2 = stringArray[right]).compareToIgnoreCase( pivotValue ) > 0) {
                right = right - 1;
            }
            stringArray[left] = value2;
            stringArray[right] = value1;
        }
        return left;
    }
    private static void QuicksortString(String[] stringArray, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = partition(stringArray, left, right);
        QuicksortString(stringArray, left, pivotIndex);
        QuicksortString(stringArray, pivotIndex+1, right);
    }
    public static void QuicksortString(String[] stringArray) {
        QuicksortString(stringArray, 0, stringArray.length - 1);
    }
    private static void printArray( String[] stringArray )
    {
        for (String s:stringArray) {
            System.out.print( s + " " );
        }
    }
    public static void main( String[] args )
    {
        String[] names = {"Pavan", "Kamal", "Sai Teja", "Vamshi", "Rithvik", "Chaitanya"};

        System.out.println("Before sorting: ");
        printArray(names);

        // Logic
        QuicksortString( names );

        // After sorting
        System.out.println("\n\nAfter sorting: ");
        printArray(names);
    }
}
