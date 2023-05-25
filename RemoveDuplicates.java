import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 3};
        int[] result = removeDuplicates(array);

        System.out.println("Original Array:");
        printArray(array);

        System.out.println("\nArray without Duplicates:");
        printArray(result);
    }

    public static int[] removeDuplicates(int[] array) {
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate over the array and add elements to the HashSet
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        // Create a new array to store unique elements
        int[] result = new int[set.size()];

        // Copy the elements from the HashSet to the new array
        int index = 0;
        for (int element : set) {
            result[index++] = element;
        }

        return result;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
