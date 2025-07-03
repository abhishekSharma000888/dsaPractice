package practice11;

import java.util.Arrays;

public class UpperCaseAndLowerCaseStrings {

    public static void main(String[] args) {

        String input = "aBACbcEDed";

        StringBuilder outputLowerCase = new StringBuilder();
        StringBuilder outputUpperCase = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                outputLowerCase.append(ch);
            } else {
                outputUpperCase.append(ch);
            }
        }

        // Convert to char array and sort
        char[] lowerArray = outputLowerCase.toString().toCharArray();
        char[] upperArray = outputUpperCase.toString().toCharArray();

        Arrays.sort(lowerArray);
        Arrays.sort(upperArray);

        System.out.println(new String(lowerArray)); // Output: abcde
        System.out.println(new String(upperArray)); // Output: ABCDE
    }
}
