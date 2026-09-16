import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static boolean checkAnagram(char[] first, char[] second) {
        if (first.length != second.length) {
            return false;
        }

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String text1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String text2 = scanner.nextLine();

        char[] chars1 = text1.toCharArray();
        char[] chars2 = text2.toCharArray();

        if (checkAnagram(chars1, chars2)) {
            System.out.println("The two strings are anagrams of each other");
        } else {
            System.out.println("The two strings are not anagrams of each other");
        }

        scanner.close();
    }
}
