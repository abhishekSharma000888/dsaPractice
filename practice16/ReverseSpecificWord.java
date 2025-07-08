package practice16;

public class ReverseSpecificWord {
    public static void main(String[] args) {
        String input = "I love programming in Java";
        String reverseWord = "programming";

        String[] words = input.split(" ");

        StringBuilder finalString = new StringBuilder();

        for (String word : words) {

            if (!word.equals(reverseWord)) {
                finalString.append(word);
                finalString.append(" ");

            } else {
                StringBuilder rev = new StringBuilder(reverseWord).reverse();

                finalString.append(rev);
                finalString.append(" ");

            }
        }

        System.out.println(finalString);
    }
}
