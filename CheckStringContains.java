package src;

public class CheckStringContains {
    public static void main(String[] args) {
        String word = "umbrella";

        if (word.contains("e")) {
            System.out.println("The string contains 'e'.");
        } else {
            System.out.println("The string does not contain 'e'.");
        }
    }
}
