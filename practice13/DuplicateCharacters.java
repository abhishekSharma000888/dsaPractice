package practice13;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DuplicateCharacters {
        public static void main(String[] args) {

            String input = "programming";

            LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<>();
            ArrayList<Character> a1 = new ArrayList<>();

            // Build frequency map
            for (char ch : input.toCharArray()) {
                if (ch != ' ') {
                    h1.put(ch, h1.getOrDefault(ch, 0) + 1);
                }
            }

            // Extract duplicate characters
            h1.forEach((key, value) -> {
                if (value > 1) {
                    a1.add(key);
                }
            });

            System.out.println("Duplicate characters: " + a1);
        }


}
