package gut.day11;

import java.util.HashMap;
//2. Find the smallest substring containing all distinct characters of the string.
//Example:
//Input:
//str = "aabcbcdbca"
//Output:
//dbca
//Constraint:
//Sliding Window


public class SmallerDistinctSubString {

    public static void main(String[] args) {

        String str = "aabcbcdbca";
        HashMap<Character, Integer> map = new HashMap<>();
        // Find total distinct characters
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int totalDistinct = map.size();
        // Map for current window
        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;

        int count = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;

        while (right < str.length()) {
            char ch = str.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            // New distinct character entered the window
            if (window.get(ch) == 1) {
                count++;
            }
            // Window contains all distinct characters
            while (count == totalDistinct) {
                int currentLength = right - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                    startIndex = left;
                }
                 char leftChar = str.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                // Character completely removed from window
                if (window.get(leftChar) == 0) {
                    count--;
                }
                left++;
            }
            right++;
        }
        System.out.println(
            str.substring(startIndex, startIndex + minLength)
        );
    }
}