// Write a program to find if a given string is a palindrome or not (ignoring case sensitivity).
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Convert to lowercase to ignore case sensitivity
        String cleanText = original.toLowerCase();

        boolean isPalindrome = true;
        int start = 0;
        int end = cleanText.length() - 1;

        // Logic: Compare characters from both ends moving inward
        while (start < end) {
            if (cleanText.charAt(start) != cleanText.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output the result
        if (isPalindrome && !cleanText.isEmpty()) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
