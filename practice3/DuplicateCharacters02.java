package practice3;

import java.util.HashMap;

public class DuplicateCharacters02 {

    public static void main(String[] args) {

        String input = "Java is the Prime Language";

        // Strings are immutable, so we need to store the result back
        input = input.toLowerCase();

        // Map to store character counts
        HashMap<Character, Integer> m1 = new HashMap<>();

        // Count character frequencies
        for (char ch : input.toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                m1.put(ch, m1.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("The duplicate characters are:");

        // Print only the duplicate characters
        m1.forEach((key, value) -> {
            if (value > 1) {
                // Added proper spacing in the print statement
                System.out.println("Character: '" + key + "' appears " + value + " times.");
            }
        });

    }
}
