import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        try {
            File file = new File("filename.txt"); // Replace "filename.txt" with the actual file name or path

            Scanner scanner = new Scanner(file);
            int wordCount = 0;

            while (scanner.hasNext()) {
                String word = scanner.next();
                wordCount++;
            }

            scanner.close();

            System.out.println("Number of words: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
