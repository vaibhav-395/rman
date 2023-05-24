public class PalindromeCheck {
    public static void main(String[] args) {
        String inputString = "radar";
        
        boolean isPalindrome = checkPalindrome(inputString);
        
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    
    public static boolean checkPalindrome(String inputString) {
        int left = 0;
        int right = inputString.length() - 1;
        
        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
