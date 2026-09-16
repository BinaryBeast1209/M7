import java.util.Scanner;

public class StringReverser {

    public static String invertCharacters(String text) {
        char[] letters = text.toCharArray();
        int left = 0;
        int right = letters.length - 1;

        while (left < right) {
            char swapTemp = letters[left];
            letters[left] = letters[right];
            letters[right] = swapTemp;
            left++;
            right--;
        }

        return new String(letters);
    }

    public static String invertWordsAndOrder(String text) {
        String[] wordList = text.split(" ");
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = wordList.length - 1; i >= 0; i--) {
            resultBuilder.append(invertCharacters(wordList[i])).append(" ");
        }

        return resultBuilder.toString().trim();
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse its words and sentence: ");
        String userInput = inputScanner.nextLine();

        if (!userInput.contains(" ")) {
            String singleReversed = invertCharacters(userInput);
            System.out.println("Reversed string: " + singleReversed);
        } else {
            String sentenceReversed = invertWordsAndOrder(userInput);
            System.out.println("Reversed string: " + sentenceReversed);
        }

        inputScanner.close();
    }
}
