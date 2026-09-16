import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayListDemo {

    public static String buildStringFromList(ArrayList<Character> charList) {
        StringBuilder builder = new StringBuilder();
        for (char ch : charList) {
            builder.append(ch);
        }
        return builder.toString();
    }

    public static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static void splitIntoEqualHalves(String text) {
        int length = text.length();

        if (length % 2 != 0) {
            System.out.println("String length is odd (" + length + "). Cannot split into two equal-length words.");
            return;
        }

        int half = length / 2;
        String firstHalf = text.substring(0, half);
        String secondHalf = text.substring(half);

        System.out.println("First Word: " + firstHalf);
        System.out.println("Second Word: " + secondHalf);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> charList = new ArrayList<>();

        System.out.print("Enter total number of characters: ");
        int total = scanner.nextInt();

        System.out.println("Enter the characters one by one:");
        for (int i = 0; i < total; i++) {
            char ch = scanner.next().charAt(0);
            charList.add(ch);
        }

        String originalString = buildStringFromList(charList);
        System.out.println("\nConstructed String: " + originalString);

        int stringLength = originalString.length();
        System.out.println("Length: " + stringLength);

        String reversedString = reverseText(originalString);
        System.out.println("Reversed String: " + reversedString);

        System.out.println("\nEqual Length Split:");
        splitIntoEqualHalves(originalString);

        scanner.close();
    }
}
