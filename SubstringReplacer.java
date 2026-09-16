import java.util.Scanner;

public class SubstringReplacer {

    public String substituteText(String source, String target, String replacement) {
        if (source == null || target == null || replacement == null || target.isEmpty()) {
            return source;
        }

        StringBuilder result = new StringBuilder();
        int cursor = 0;
        int matchIndex;

        while ((matchIndex = source.indexOf(target, cursor)) != -1) {
            result.append(source, cursor, matchIndex);
            result.append(replacement);
            cursor = matchIndex + target.length();
        }

        if (cursor < source.length()) {
            result.append(source.substring(cursor));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        SubstringReplacer replacer = new SubstringReplacer();

        System.out.print("Enter the main string: ");
        String mainText = inputScanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String oldTarget = inputScanner.nextLine();

        System.out.print("Enter the new substring: ");
        String newTarget = inputScanner.nextLine();

        String updatedText = replacer.substituteText(mainText, oldTarget, newTarget);
        System.out.println("Modified string: " + updatedText);

        inputScanner.close();
    }
}
