package practice21;

import java.util.LinkedHashMap;

public class ConvertString {
    public static void main(String[] args) {


        String input = "tomorrow";
        LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            h1.put(ch, h1.getOrDefault(ch, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            int count = h1.get(ch);
            if (count == 1) {
                result.append(ch);
            } else {
                result.append(count);
            }
        }

        System.out.println(result.toString()); // Output: t3m3223w

    }
}
