package practice24;

import java.util.LinkedHashMap;

public class AppendCharCount {
    public static void main(String[] args) {

        String input = "append the character";
        // Replace char with count if count > 1

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency of each character (excluding space)
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        // Build result string
        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                sb.append(' ');
            } else {
                int count = map.get(ch);
                if (count > 1) {
                    sb.append(count);
                } else {
                    sb.append(ch);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
