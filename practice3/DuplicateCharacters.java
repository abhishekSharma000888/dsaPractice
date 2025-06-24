package practice3;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {

        // Input String
        String input = "I am a Java String!";

        // Convert the string to lowercase to ensure case-insensitive comparison
        input = input.toLowerCase();

        // Create a HashMap to store character frequencies
        Map<Character, Integer> m1 = new HashMap<>();

        // Loop through each character and update the count in the map
        for (char ch : input.toCharArray()) {
            // Ignore spaces if you don't want to count them
            if (ch != ' ') {
                m1.put(ch, m1.getOrDefault(ch, 0) + 1);
            }
        }

        // Print duplicate characters
        System.out.println("The duplicate characters are:");

        m1.forEach((key, value) -> {
            if (value > 1) { // Only interested in duplicates
                System.out.println("Character: '" + key + "' appears " + value + " times.");
            }
        });
    }
}
