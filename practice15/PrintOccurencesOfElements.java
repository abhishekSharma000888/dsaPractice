package practice15;

import java.util.LinkedHashMap;

public class PrintOccurencesOfElements {
    public static void main(String[] args) {

            String input1 = "ABCCD";
            String input2 = "DAB";

            LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<>();

            // Count characters in the first string
            for (char ch : input1.toCharArray()) {
                if (ch != ' ') {
                    h1.put(ch, h1.getOrDefault(ch, 0) + 1);
                }
            }

            // Count characters in the second string
            for (char ch : input2.toCharArray()) {
                if (ch != ' ') {
                    h1.put(ch, h1.getOrDefault(ch, 0) + 1);
                }
            }

            System.out.println(h1);
    }
}
