import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longestSequence = 0;

        // Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        // Iterate through the array and find the longest sequence
        for (int num : nums) {
            // Check if the previous number is present in the set
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;

                // Increment the current number and sequence until the next number is not present in the set
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }

                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }

        return longestSequence;
    }

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};

        int longestSequenceLength = longestConsecutive(nums);

        System.out.println("The length of the longest consecutive elements sequence is: " + longestSequenceLength);
    }
}
