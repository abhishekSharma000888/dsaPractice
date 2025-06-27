package practice5;

import java.util.LinkedHashSet;

public class GiveSpecificOutput {
    public static void main(String[] args) {

        String input = "aBACbcEDed";

        input = input.toLowerCase();

        LinkedHashSet<Character> h1 = new LinkedHashSet<>();

        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();

        // Collect unique characters
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                h1.add(ch);
            }
        }

        // Build lowerCase and upperCase strings
        for (char ch : h1) {
            lowerCase.append(ch);
            upperCase.append(Character.toUpperCase(ch));
        }

        System.out.println("LowerCase String: " + lowerCase);
        System.out.println("UpperCase String: " + upperCase);
    }
}
