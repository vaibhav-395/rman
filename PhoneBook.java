import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of entries in the phone book
        int numEntries = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create a HashMap to store the phone book entries
        Map<String, String> phoneBook = new HashMap<>();

        // Read the phone book entries
        for (int i = 0; i < numEntries; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        // Process the queries
        while (scanner.hasNext()) {
            String query = scanner.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}
