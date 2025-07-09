package practice17;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        String input = "remove the duplicate characters from the string";

        HashMap<Character, Integer> h1 = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : input.toCharArray()) {

            if (ch != ' ') {
                h1.put(ch, h1.getOrDefault(ch, 0) + 1);
            }
        }

        h1.forEach((key, value) -> {
            if (value == 1) {

              sb.append(key);
            }
        });

        System.out.println(sb);
    }
}

