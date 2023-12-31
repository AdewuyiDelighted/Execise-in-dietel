package ArrayExecise;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%n doubleArray: ");
        for (double value : doubleArray) {
            System.out.printf("%.1f", value);
        }
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        int location = Arrays.binarySearch(intArray, 89);
        System.out.println("\n"+location);

    }


    public static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);
        for (int value : array) {
            System.out.printf("%d ", value);
        }
    }
}
