package practice35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeparateArrayAlphanumeric {
    public static void main(String[] args) {
        char[] arr = {'a', '1', 'b', '3', 'c', '2', 'z', '9'};

        List<Character> alphabets = new ArrayList<>();
        int sum = 0;

        for (char ch : arr) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            } else if (Character.isLetter(ch)) {
                alphabets.add(ch);
            }
        }

        // Sort alphabets
        Collections.sort(alphabets);

        // Print results
        System.out.println("Sorted Alphabets: " + alphabets);
        System.out.println("Sum of Numbers: " + sum);
    }
}
