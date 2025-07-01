package practice10;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class PrintMiddleNonRepeatingCharacter {

    public static void main(String[] args) {

        String input = "switchas switches que testing";

        LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<>();
        ArrayList<Character> nonRepeatingList = new ArrayList<>();

        // Step 1: Count character occurrences
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                h1.put(ch, h1.getOrDefault(ch, 0) + 1);
            }
        }

        // Step 2: Store non-repeating characters in order
        h1.forEach((key, value) -> {
            if (value == 1) {
                System.out.print(key + " ");
                nonRepeatingList.add(key);
            }
        });

        System.out.println(); // For better formatting

        // Step 3: Find and print middle non-repeating character
        if (nonRepeatingList.size() > 0) {
            int middleIndex = nonRepeatingList.size() / 2;
            char middleElement = nonRepeatingList.get(middleIndex);
            System.out.println("Middle non-repeating character: " + middleElement);
        } else {
            System.out.println("No non-repeating characters found.");
        }
    }
}
