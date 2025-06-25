package practice4;

import java.util.HashMap;

public class VowelsAndConsonentsExample {

    public static void main(String[] args) {

        String input = "I am not a vowel or a consonent either.";

        input = input.toLowerCase();

        HashMap<Character, Integer> h1 = new HashMap<>();

        for (char ch : input.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {  // Only consider alphabets

                h1.put(ch, h1.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Let's print the vowels and consonants count!");

        for (Character key : h1.keySet()) {

            if (key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u') {

                System.out.println("Vowel '" + key + "' occurred " + h1.get(key) + " times.");
            } else {
                System.out.println("Consonant '" + key + "' occurred " + h1.get(key) + " times.");
            }
        }
    }
}
