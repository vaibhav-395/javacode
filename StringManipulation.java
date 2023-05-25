package src;

import java.util.Arrays;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[10];

        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        System.out.println("Sorted strings:");
        sortStrings(strings);

        System.out.println("Combined string:");
        String combinedString = combineStrings(strings);
        System.out.println(combinedString);

        System.out.println("Reversed first string:");
        String reversedString = reverseString(strings[0]);
        System.out.println(reversedString);

        scanner.close();
    }

    // Method to sort an array of strings in ascending order
    public static void sortStrings(String[] strings) {
        Arrays.sort(strings);
        for (String str : strings) {
            System.out.println(str);
        }
    }

    // Method to combine two strings
    public static String combineStrings(String[] strings) {
        String combinedString = "";
        for (String str : strings) {
            combinedString += str;
        }
        return combinedString;
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversedString = new StringBuilder(str);
        return reversedString.reverse().toString();
    }
}
