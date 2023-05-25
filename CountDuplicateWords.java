package src;

import java.util.HashMap;

public class CountDuplicateWords {
    public static void main(String[] args) {
        String sentence = "the sun is shining and the birds are singing the birds";
        HashMap<String, Integer> wordCountMap = countDuplicateWords(sentence);

        System.out.println("Sentence: " + sentence);
        System.out.println("\nDuplicate Words Count:");
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            if (count > 1) {
                System.out.println(word + ": " + count);
            }
        }
    }

    public static HashMap<String, Integer> countDuplicateWords(String sentence) {
        // Split the sentence into words using whitespace as the delimiter
        String[] words = sentence.split("\\s+");

        // Create a HashMap to store the word count
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Iterate over each word
        for (String word : words) {
            // Get the current count of the word from the HashMap, defaulting to 0 if not present
            int count = wordCountMap.getOrDefault(word, 0);

            // Increment the count by 1
            count++;

            // Update the word count in the HashMap
            wordCountMap.put(word, count);
        }

        return wordCountMap;
    }
}
