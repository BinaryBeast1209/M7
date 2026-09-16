import java.util.Scanner;

public class StringFun {

    public static String reverseString(String text) {
        StringBuilder builder = new StringBuilder(text);
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the number of characters: ");
        int totalChars = inputScanner.nextInt();

        inputScanner.nextLine();
        System.out.print("Enter the string: ");
        String userInput = inputScanner.nextLine();

        System.out.println("Original String: " + userInput);

        String invertedText = reverseString(userInput);
        System.out.println("Reverse String: " + invertedText);

        String mergedText = userInput + " (" + invertedText + ")";
        System.out.println("Concatenated String: " + mergedText);

        inputScanner.close();
    }
}
