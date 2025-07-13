package practice17;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MiddleUniqueElement {

    public static void main(String[] args) {
        String input = "switchas switches que testing";
        ArrayList<Character> uniqueChars = new ArrayList<>();
        LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        freqMap.forEach((key, value) -> {
            if (value == 1) {
                uniqueChars.add(key);
            }
        });

        if (uniqueChars.size() > 0) {
            int middleIndex = uniqueChars.size() / 2;
            System.out.println("The middle unique element is: " + uniqueChars.get(middleIndex));
        } else {
            System.out.println("No unique characters found.");
        }
    }
}
