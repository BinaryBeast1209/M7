import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {

    public static boolean isPangram(String text) {
        Set<Character> uniqueLetters = new HashSet<>();

        for (char ch : text.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                uniqueLetters.add(ch);
            }
        }

        return uniqueLetters.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a Pangram:");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("\"" + input + "\" is a Pangram");
        } else {
            System.out.println("\"" + input + "\" is not a Pangram");
        }

        scanner.close();
    }
}
