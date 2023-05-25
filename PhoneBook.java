package src;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        // Read the number of entries in the phone book
        Scanner scanner = new Scanner(System.in);
        int numEntries = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Read and store the phone book entries
        for (int i = 0; i < numEntries; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        // Read the queries until end-of-file
        while (scanner.hasNextLine()) {
            String query = scanner.nextLine();
            if (phoneBook.containsKey(query)) {
                String phoneNumber = phoneBook.get(query);
                System.out.println(query + " " + phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}
