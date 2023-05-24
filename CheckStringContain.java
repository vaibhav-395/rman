public class CheckStringContain {
    public static void main(String[] args) {
        String word = "umbrella";
        
        boolean containsE = word.contains("e");
        
        if (containsE) {
            System.out.println("The string contains 'e'.");
        } else {
            System.out.println("The string does not contain 'e'.");
        }
    }
}
