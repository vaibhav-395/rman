import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords {
    public static void main(String[] args) {
        String inputString = "Hello world Hello Java world Java Hello";
        Map<String, Integer> wordCountMap = countDuplicateWords(inputString);
        
        System.out.println("Duplicate words count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
    
    public static Map<String, Integer> countDuplicateWords(String inputString) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        // Split the input string into words
        String[] words = inputString.toLowerCase().split(" ");
        
        // Count the occurrences of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        return wordCountMap;
    }
}
