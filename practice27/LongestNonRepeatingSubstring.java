package practice27;

import java.util.HashSet;

public class LongestNonRepeatingSubstring {

    public static void main(String[] args) {

        String input = "abcdabc";

        System.out.println("The longest substring without repeating characters is: "
                + longestNonRepeatingSubstring(input));
    }

    public static String longestNonRepeatingSubstring(String s) {

        int i = 0, j = 0, maxLength = 0, startIndex = 0;

        HashSet<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));

                // FIXED: Should update if the current window is longer
                if (maxLength < j - i + 1) {
                    maxLength = j - i + 1;
                    startIndex = i;
                }
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return s.substring(startIndex, startIndex + maxLength);
    }
}

