package interviewPracticeQuestions; // Package declaration

// Import required classes from Java Collections Framework
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUniqueElementsInAString {

    public static void main(String[] args) {

        // Input string to check for unique characters
        String input = "rtrrutwe";

        // HashSet to track all characters we've seen
        Set<Character> seen = new HashSet<>();

        // HashSet to store characters that appear more than once
        Set<Character> duplicates = new HashSet<>();

        // List to collect characters that are unique (appear only once)
        List<Character> unique = new ArrayList<>();

        // First loop: identify duplicates
        for (char ch : input.toCharArray()) {
            // Try adding character to `seen` set.
            // If it's already there (add returns false), it's a duplicate.
            if (!seen.add(ch)) {
                duplicates.add(ch); // Add to duplicates if already seen
            }
        }

        // Second loop: collect characters that are not duplicates
        for (char ch : input.toCharArray()) {
            // If character is NOT in duplicates set, it's unique
            if (!duplicates.contains(ch)) {
                unique.add(ch); // Add to unique list
            }
        }

        // Print the result
        System.out.println("Unique Characters = " + unique); // Output: [w, e]
    }
}
