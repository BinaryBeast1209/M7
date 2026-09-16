import java.util.Scanner;

public class RabinKarpMatcher {

    private static final int ALPHABET_BASE = 10;

    public static void findOccurrences(String pattern, String text, int primeModulus) {
        int patternLength = pattern.length();
        int textLength = text.length();

        int patternHash = 0;
        int currentWindowHash = 0;
        int highestPower = 1;

        for (int i = 0; i < patternLength - 1; i++) {
            highestPower = (highestPower * ALPHABET_BASE) % primeModulus;
        }

        for (int i = 0; i < patternLength; i++) {
            patternHash = (ALPHABET_BASE * patternHash + pattern.charAt(i)) % primeModulus;
            currentWindowHash = (ALPHABET_BASE * currentWindowHash + text.charAt(i)) % primeModulus;
        }

        for (int index = 0; index <= textLength - patternLength; index++) {
            if (patternHash == currentWindowHash) {
                int matchIndex = 0;
                while (matchIndex < patternLength && text.charAt(index + matchIndex) == pattern.charAt(matchIndex)) {
                    matchIndex++;
                }

                if (matchIndex == patternLength) {
                    System.out.println("Pattern found at position: " + (index + 1));
                }
            }

            if (index < textLength - patternLength) {
                currentWindowHash = (ALPHABET_BASE * (currentWindowHash - text.charAt(index) * highestPower) + text.charAt(index + patternLength)) % primeModulus;

                if (currentWindowHash < 0) {
                    currentWindowHash += primeModulus;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = inputScanner.nextLine();

        System.out.print("Enter the pattern to search for: ");
        String pattern = inputScanner.nextLine();

        System.out.print("Enter a prime number for modulus (e.g., 13): ");
        int primeModulus = inputScanner.nextInt();

        findOccurrences(pattern, text, primeModulus);

        inputScanner.close();
    }
}
