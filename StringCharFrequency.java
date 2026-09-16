import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCharFrequency {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String text1 = inputScanner.nextLine();
        System.out.println("For " + text1);
        displayCharacterFrequencies(text1);

        System.out.print("Enter the second string: ");
        String text2 = inputScanner.nextLine();
        System.out.println("For " + text2);
        displayCharacterFrequencies(text2);

        inputScanner.close();
    }

    private static void displayCharacterFrequencies(String text) {
        if (text.isEmpty()) {
            System.out.println("Empty string");
            return;
        }

        List<CharacterCount> trackerList = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            boolean exists = false;

            for (CharacterCount item : trackerList) {
                if (item.symbol == currentSymbol) {
                    item.count++;
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                trackerList.add(new CharacterCount(currentSymbol, 1));
            }
        }

        for (CharacterCount item : trackerList) {
            System.out.println(item.symbol + " " + item.count);
        }
    }
}

class CharacterCount {
    char symbol;
    int count;

    CharacterCount(char symbol, int count) {
        this.symbol = symbol;
        this.count = count;
    }
}
