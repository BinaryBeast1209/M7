import java.util.Scanner;

public class SubstringOccurrences {

    public int getOccurrenceCount(String text, String target) {
        if (target.isEmpty()) {
            return 0;
        }

        int totalMatches = 0;
        int currentPos = 0;

        while ((currentPos = text.indexOf(target, currentPos)) != -1) {
            totalMatches++;
            currentPos += target.length();
        }

        return totalMatches;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        SubstringOccurrences counter = new SubstringOccurrences();

        System.out.print("Enter the main string: ");
        String mainText = inputScanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String targetText = inputScanner.nextLine();

        int occurrences = counter.getOccurrenceCount(mainText, targetText);

        System.out.println("The substring \"" + targetText + "\" appears " + occurrences + " times in the main string.");

        inputScanner.close();
    }
}
