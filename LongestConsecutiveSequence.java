package src;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int findLongestConsecutiveSequence(int[] nums) {
        // Create a HashSet to store the numbers in the array
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;

        // Add all the numbers to the HashSet
        for (int num : nums) {
            set.add(num);
        }

        // Iterate through the array and check for consecutive sequences
        for (int num : nums) {
            // If the current number is the start of a sequence (no previous smaller number in the set)
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Check for consecutive numbers in the set
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update the maxLength if the current sequence is longer
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};

        int longestSequenceLength = findLongestConsecutiveSequence(nums);
        System.out.println("The length of the longest consecutive elements sequence is: " + longestSequenceLength);
    }
}
