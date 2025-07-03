public class ReverseLastWordOfTheString {

    public static void main(String[] args) {

        String input = "I Love Java Programming";
        String[] words = input.split(" ");  // split by space to get words

        StringBuilder sb = new StringBuilder();

        // Reverse the last word
        String lastWord = words[words.length - 1];
        String reversedLastWord = new StringBuilder(lastWord).reverse().toString();

        // Build the final output
        for (int i = 0; i < words.length - 1; i++) {
            sb.append(words[i]).append(" ");
        }

        sb.append(reversedLastWord);

        System.out.println(sb.toString());
    }
}
