package src;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Array 1:");
        printArray(array1);

        System.out.println("\nArray 2:");
        printArray(array2);

        System.out.println("\nCommon Elements:");
        printArray(commonElements);
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        // Create a HashSet to store elements from the first array
        HashSet<Integer> set = new HashSet<>();

        // Add elements from the first array to the HashSet
        for (int i = 0; i < array1.length; i++) {
            set.add(array1[i]);
        }

        // Create an ArrayList to store common elements
        ArrayList<Integer> commonElements = new ArrayList<>();

        // Iterate over the second array and check if each element is present in the HashSet
        for (int i = 0; i < array2.length; i++) {
            if (set.contains(array2[i])) {
                commonElements.add(array2[i]);
            }
        }

        // Create a new array to store the common elements
        int[] result = new int[commonElements.size()];

        // Copy the elements from the ArrayList to the new array
        for (int i = 0; i < commonElements.size(); i++) {
            result[i] = commonElements.get(i);
        }

        return result;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
