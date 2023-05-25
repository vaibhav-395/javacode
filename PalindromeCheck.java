package src;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = checkPalindrome(str);

        System.out.println("String: " + str);

        if (isPalindrome) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) {
        // Remove any non-alphanumeric characters and convert to lowercase
        String processedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare characters from both ends of the processed string
        int left = 0;
        int right = processedStr.length() - 1;

        while (left < right) {
            if (processedStr.charAt(left) != processedStr.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }

            left++;
            right--;
        }

        return true; // All characters matched, it is a palindrome
    }
}
