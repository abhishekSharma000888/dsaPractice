package practice4;

import java.util.Arrays;

public class ReverseEachWord {

    public static void main(String[] args) {

        String input = "Reverse each word";

        String[] words = input.split(" ");

        for (String word: words){

            StringBuilder reverseWord = new StringBuilder(word);

            reverseWord.reverse();

            System.out.println(reverseWord);
        }
    }
}
