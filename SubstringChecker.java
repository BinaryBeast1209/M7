import java.util.Scanner;

public class SubstringChecker {

    public boolean containsSubstring(String text, String target) {
        return text.contains(target);
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        SubstringChecker checker = new SubstringChecker();

        System.out.print("Enter the main string (str1): ");
        String mainText = inputScanner.nextLine();

        System.out.print("Enter the substring (str2): ");
        String queryText = inputScanner.nextLine();

        if (checker.containsSubstring(mainText, queryText)) {
            System.out.println("\"" + queryText + "\" is a substring of \"" + mainText + "\"");
        } else {
            System.out.println("\"" + queryText + "\" is not a substring of \"" + mainText + "\"");
        }

        inputScanner.close();
    }
}
