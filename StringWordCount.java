import java.util.HashMap;
import java.util.Scanner;

public class StringWordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        // Split the string into words
        String[] words = input.split(" ");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Count the number of occurrences of each word
        for (String word : words) {
            // Remove leading and trailing spaces, if any
            word = word.trim();

            if (!word.isEmpty()) {
                // Get the current count of the word from the map
                int count = wordCountMap.getOrDefault(word, 0);

                // Increment the count by 1 and update the map
                wordCountMap.put(word, count + 1);
            }
        }

        // Print the word count map
        System.out.println(wordCountMap);
    }
}
