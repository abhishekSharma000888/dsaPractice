package practice3;

import java.util.HashMap;

public class CountCharactersInGivenString {

    public static void main(String[] args) {

        String input = "You are doing awesome, keep it up!";

        // Create a HashMap to store character counts
        HashMap<Character, Integer> h1 = new HashMap<>();

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                h1.put(ch, h1.getOrDefault(ch, 0) + 1);
            }
        }

        // Display character occurrences
        System.out.println("The occurrences of the characters are: ");

        h1.forEach((key, value) -> {
            System.out.println("Character: '" + key + "' occurs " + value + " times.");
        });
    }
}
