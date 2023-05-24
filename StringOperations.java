import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];

        // Read 10 strings from the console
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        // Sort the strings
        Arrays.sort(strings);

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Combine two strings
        String combinedString = strings[0] + strings[1];
        System.out.println("Combined string: " + combinedString);

        // Reverse the first string
        String reversedString = new StringBuilder(strings[0]).reverse().toString();
        System.out.println("Reversed first string: " + reversedString);
    }
}
