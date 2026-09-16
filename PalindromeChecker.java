import java.util.Scanner;

public class PalindromeChecker {

    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string as an input to check whether it is palindrome or not:");
        String userInput = scanner.nextLine();

        if (checkPalindrome(userInput)) {
            System.out.println(userInput + " is a palindrome string");
        } else {
            System.out.println(userInput + " is not a palindrome string");
        }

        scanner.close();
    }
}
