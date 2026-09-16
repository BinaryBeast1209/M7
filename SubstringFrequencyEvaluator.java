import java.util.HashMap;
import java.util.Map;

public class SubstringFrequencyEvaluator {

    public static Map<String, Integer> getKLengthSubstringCounts(String sourceText, int k) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        if (sourceText == null || k <= 0 || k > sourceText.length()) {
            return frequencyMap;
        }

        for (int i = 0; i <= sourceText.length() - k; i++) {
            String fragment = sourceText.substring(i, i + k);
            frequencyMap.put(fragment, frequencyMap.getOrDefault(fragment, 0) + 1);
        }

        return frequencyMap;
    }
}
