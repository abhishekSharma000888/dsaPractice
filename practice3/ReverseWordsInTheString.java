package practice3;

public class ReverseWordsInTheString {

    public static void main(String[] args) {

        String input = "Welcome to the reversed string";

        String[] words = input.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String word: words){

            StringBuilder reversedWord = new StringBuilder(word);

            sb.append(reversedWord.reverse()).append(" ");

        }

        System.out.println(sb);
    }
}
