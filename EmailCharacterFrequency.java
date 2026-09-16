import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EmailCharacterFrequency {

    public static void analyzeEmailSymbols(String email) {
        Map<Character, Integer> symbolCounts = new LinkedHashMap<>();

        for (char symbol : email.toCharArray()) {
            if (!Character.isLetter(symbol)) {
                symbolCounts.put(symbol, symbolCounts.getOrDefault(symbol, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : symbolCounts.entrySet()) {
            System.out.println(entry.getKey() + " —> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter email address: ");
        String userEmail = inputScanner.nextLine();

        analyzeEmailSymbols(userEmail);

        inputScanner.close();
    }
}
