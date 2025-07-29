package practice28;

import java.util.LinkedHashMap;

public class ReplaceStringWithCharacterCount {

    public static void main(String[] args) {

        String input = "programming";
        StringBuilder sb = new StringBuilder();

        LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {

            h1.put(ch, h1.getOrDefault(ch, 0) + 1);
        }

        //replace character if it has occured more then once

        for (char ch : input.toCharArray()) {

            int count = h1.get(ch);

            if (count > 1) {
                sb.append(count);
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
