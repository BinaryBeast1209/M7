import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromePartitioner {

    public List<List<String>> partition(String text) {
        List<List<String>> resultList = new ArrayList<>();
        List<String> currentPath = new ArrayList<>();
        backtrack(text, 0, currentPath, resultList);
        return resultList;
    }

    private void backtrack(String text, int start, List<String> currentPath, List<List<String>> resultList) {
        if (start == text.length()) {
            resultList.add(new ArrayList<>(currentPath));
            return;
        }

        for (int end = start; end < text.length(); end++) {
            if (isPalindrome(text, start, end)) {
                currentPath.add(text.substring(start, end + 1));
                backtrack(text, end + 1, currentPath, resultList);
                currentPath.remove(currentPath.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String text, int left, int right) {
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = inputScanner.nextLine();

        PalindromePartitioner partitioner = new PalindromePartitioner();
        List<List<String>> partitions = partitioner.partition(text);

        System.out.println(partitions);

        inputScanner.close();
    }
}
