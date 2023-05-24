public class ReverseString {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String reversedString = reverseString(inputString);
        
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);
    }
    
    public static String reverseString(String inputString) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }
        
        return reversed.toString();
    }
}
