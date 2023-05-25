package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        try {
            File file = new File("textfile.txt"); // Replace "textfile.txt" with your actual file path
            Scanner scanner = new Scanner(file);

            int wordCount = 0;

            while (scanner.hasNext()) {
                String word = scanner.next();
                wordCount++;
            }

            System.out.println("Number of words in the file: " + wordCount);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
