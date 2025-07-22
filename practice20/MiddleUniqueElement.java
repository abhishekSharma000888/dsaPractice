package practice20;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MiddleUniqueElement {
        public static void main(String[] args) {

            String input = "switchas switches que testing";

            LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<>();
            ArrayList<Character> a1 = new ArrayList<>();

            for (char ch : input.toCharArray()) {
                if (ch != ' ') {
                    h1.put(ch, h1.getOrDefault(ch, 0) + 1);
                }
            }

            h1.forEach((key, value) -> {
                if (value == 1) {
                    a1.add(key);
                }
            });

            if (a1.isEmpty()) {
                System.out.println("No unique characters found.");
            } else {
                int k = a1.size() / 2;
                char middleElement = a1.get(k);
                System.out.println("The middle unique element is: " + middleElement);
            }
        }
    }

