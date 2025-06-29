package practice9;

public class ReverseLastWord {

    public static void main(String[] args) {

        String input = "I Love Java Programming";

        StringBuilder sb = new StringBuilder();

        String[] words = input.split(" ");

        String lastWord = words[words.length - 1];

        sb.append(lastWord).reverse();

        StringBuilder finalString = new StringBuilder();

        // Append the first three words with a space
        finalString.append(words[0]).append(" ");
        finalString.append(words[1]).append(" ");
        finalString.append(words[2]).append(" ");

        // Append the reversed last word
        finalString.append(sb);

        System.out.println("The final string is: " + finalString);
    }
}
