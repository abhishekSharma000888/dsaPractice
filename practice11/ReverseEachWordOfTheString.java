package practice11;

public class ReverseEachWordOfTheString {

    public static void main(String[] args) {

        String input = "Java program to reverse each word of a given string";

        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder(input.length());

        for(String word: words){

            sb.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(sb);
    }
}
