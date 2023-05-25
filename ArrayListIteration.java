package src;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println("Iterator Loop:");
        iterateUsingIterator(arrayList);

        System.out.println("Advanced For Loop:");
        iterateUsingEnhancedForLoop(arrayList);

        System.out.println("For Loop:");
        iterateUsingForLoop(arrayList);
    }

    // Method to iterate over ArrayList using Iterator
    public static void iterateUsingIterator(ArrayList<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Method to iterate over ArrayList using Enhanced For Loop
    public static void iterateUsingEnhancedForLoop(ArrayList<Integer> arrayList) {
        for (int num : arrayList) {
            System.out.println(num);
        }
    }

    // Method to iterate over ArrayList using for-loop
    public static void iterateUsingForLoop(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
