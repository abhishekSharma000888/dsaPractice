package practice36;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    /**
     * Finds the first non-repeating character in a string
     * @param input String input
     * @return first non-repeating character or null if none exists
     */
    public static Character findFirstNonRepeingChar(String input) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Find first character with frequency 1
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String input = "programming";

        Character result = findFirstNonRepeingChar(input);

        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}