package practice9;

public class SubstringExample {

    public static void main(String[] args) {

        String input = "Victor Lake Tweet";

        // Expected output: V.L.Tweet

        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        // Take the first letter of the first two words and add dot
        for (int i = 0; i < words.length; i++) {

            if (i < words.length - 1) {
                // Add the first character and a dot for first two words
                result.append(words[i].charAt(0)).append(".");
            } else {
                // Add the last word as it is
                result.append(words[i]);
            }
        }

        System.out.println("Formatted Output: " + result.toString());
    }
}
