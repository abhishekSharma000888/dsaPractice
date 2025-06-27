package practice7;

import java.util.LinkedHashMap;

public class ReplaceSpecificCharactersWithNumbers {
    public static void main(String[] args) {

        String input = "tomorrow";

        LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<>();

        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {

            if (ch != ' ') {
                h1.put(ch, h1.getOrDefault(ch, 0) + 1);

                // If first occurrence, add the character
                if (h1.get(ch) == 1) {
                    result.append(ch);
                } else { // If not first occurrence, add the count
                    result.append(h1.get(ch));
                }
            }
        }

        System.out.println(result);
    }
}
