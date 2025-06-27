package practice7;

public class ReverseLastWordInTheString {

    public static void main(String[] args) {

        String input = "I Love Java Programming";

        // Split the input string into words
        String[] words = input.split(" ");

        // Get the last word
        String lastWord = words[words.length - 1];

        // Reverse the last word
        StringBuilder reversedLastWord = new StringBuilder(lastWord).reverse();

        // Build the final string
        StringBuilder result = new StringBuilder();

        // Append all words except the last one
        for (int i = 0; i < words.length - 1; i++) {
            result.append(words[i]).append(" ");
        }

        // Append the reversed last word
        result.append(reversedLastWord);

        System.out.println(result.toString());
    }
}
