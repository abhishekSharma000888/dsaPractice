package practice7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class MiddleUniqueCharacters {

    public static void main(String[] args) {

        String input = "switchas switches que testing";
        input = input.replaceAll(" ", "").toLowerCase();

        LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Collect unique characters
        ArrayList<Character> uniqueChars = new ArrayList<>();
        for (char ch : freqMap.keySet()) {
            if (freqMap.get(ch) == 1) {
                uniqueChars.add(ch);
            }
        }

        if (uniqueChars.size() == 0) {
            System.out.println("No unique characters found.");
        } else {
            int middleIndex = uniqueChars.size() / 2;
            char middleUniqueChar = uniqueChars.get(middleIndex);
            System.out.println("Middle Unique Character: " + middleUniqueChar);
        }
    }
}
