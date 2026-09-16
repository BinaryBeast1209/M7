import java.util.Scanner;

public class PatternOccurrenceCounter {

    public static int countOccurrences(String pattern, String text) {
        if (pattern == null || text == null || pattern.isEmpty() || text.length() < pattern.length()) {
            return 0;
        }

        int count = 0;
        int patternLength = pattern.length();
        int textLength = text.length();

        for (int i = 0; i <= textLength - patternLength; i++) {
            boolean isMatch = true;

            for (int j = 0; j < patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String pattern = inputScanner.next();
        String text = inputScanner.next();

        int totalMatches = countOccurrences(pattern, text);

        System.out.println(totalMatches);

        inputScanner.close();
    }
}
