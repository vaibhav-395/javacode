package src;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Reverse the character array
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // Convert the character array back to a string
        String reversedStr = new String(charArray);

        return reversedStr;
    }
}
